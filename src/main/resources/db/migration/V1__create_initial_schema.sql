CREATE TABLE Usuario (
                         id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(255),
                         email VARCHAR(255),
                         senha VARCHAR(255),
                         bio TEXT,
                         fotoPerfil VARCHAR(255)
);

CREATE TABLE Jogo (
                      id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                      titulo VARCHAR(255),
                      descricao TEXT,
                      dataLancamento DATE,
                      desenvolvedor VARCHAR(255),
                      genero VARCHAR(255)
);

CREATE TABLE Avaliacao (
                           id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                           nota FLOAT,
                           comentario TEXT,
                           data DATE,
                           autor_id INT,
                           jogo_id INT,
                           curtidas INT,
                           FOREIGN KEY (autor_id) REFERENCES Usuario(id),
                           FOREIGN KEY (jogo_id) REFERENCES Jogo(id)
);

CREATE TABLE ListaJogos (
                            id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                            nome VARCHAR(255),
                            autor_id INT,
                            dataCriacao DATE,
                            FOREIGN KEY (autor_id) REFERENCES Usuario(id)
);

CREATE TABLE FeedAtividade (
                               id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                               usuario_id INT,
                               FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);

CREATE TABLE Atividade (
                           id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                           tipo ENUM('Avaliacao', 'CriacaoLista', 'SeguirUsuario'),
                           data DATE,
                           usuario_id INT,
                           detalhes TEXT,
                           feed_id INT,
                           FOREIGN KEY (usuario_id) REFERENCES Usuario(id),
                           FOREIGN KEY (feed_id) REFERENCES FeedAtividade(id)
);

CREATE TABLE Notificacao (
                             id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                             mensagem TEXT,
                             data DATE,
                             usuario_id INT,
                             visualizada BOOLEAN,
                             FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);

CREATE TABLE Tag (
                     nome VARCHAR(255) NOT NULL PRIMARY KEY,
                     descricao TEXT
);

CREATE TABLE Usuario_Seguidores (
                                    usuario_id INT,
                                    seguidor_id INT,
                                    PRIMARY KEY (usuario_id, seguidor_id),
                                    FOREIGN KEY (usuario_id) REFERENCES Usuario(id),
                                    FOREIGN KEY (seguidor_id) REFERENCES Usuario(id)
);

CREATE TABLE Jogo_Tags (
                           jogo_id INT,
                           tag_nome VARCHAR(255),
                           PRIMARY KEY (jogo_id, tag_nome),
                           FOREIGN KEY (jogo_id) REFERENCES Jogo(id),
                           FOREIGN KEY (tag_nome) REFERENCES Tag(nome)
);

CREATE TABLE ListaJogos_Jogos (
                                  lista_id INT,
                                  jogo_id INT,
                                  PRIMARY KEY (lista_id, jogo_id),
                                  FOREIGN KEY (lista_id) REFERENCES ListaJogos(id),
                                  FOREIGN KEY (jogo_id) REFERENCES Jogo(id)
);