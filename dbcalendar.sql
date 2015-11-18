
CREATE TABLE Calendar (
                id INT AUTO_INCREMENT NOT NULL,
                weekCalendar VARCHAR(2) NOT NULL,
                dayCalendar VARCHAR(2) NOT NULL,
                dateCalendar DATE NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Users (
                id INT AUTO_INCREMENT NOT NULL,
                username VARCHAR(40) NOT NULL,
                userPassword VARCHAR(50) NOT NULL,
                firstName VARCHAR(40) NOT NULL,
                lastname VARCHAR(60) NOT NULL,
                dni VARCHAR(4) NOT NULL,
                sex VARCHAR(20) NOT NULL,
                address VARCHAR(60) NOT NULL,
                telephone INT NOT NULL,
                email VARCHAR(50) NOT NULL,
                state INT NOT NULL,
                image VARCHAR(50) NOT NULL,
                role VARCHAR(40) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Institution (
                id INT AUTO_INCREMENT NOT NULL,
                codeInstitution VARCHAR(20) NOT NULL,
                nameInstitution VARCHAR(60) NOT NULL,
                address VARCHAR(60) NOT NULL,
                latitude VARCHAR(10) NOT NULL,
                longitude VARCHAR(10) NOT NULL,
                state INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Manager (
                id INT NOT NULL,
                yearWork VARCHAR(4) NOT NULL,
                state INT NOT NULL,
                UserId INT NOT NULL,
                InstitutionId INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Files (
                id INT NOT NULL,
                nameFile VARCHAR(40) NOT NULL,
                description VARCHAR(10) NOT NULL,
                dateLoad DATE NOT NULL,
                institutionId INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Activity (
                id INT NOT NULL,
                userInvited INT,
                title VARCHAR(50) NOT NULL,
                description VARCHAR(200),
                place VARCHAR(80) NOT NULL,
                dateEvent DATETIME NOT NULL,
                startHour VARCHAR(5) NOT NULL,
                endHour VARCHAR(5) NOT NULL,
                priority VARCHAR(20) NOT NULL,
                userId INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE Evidences (
                id INT NOT NULL,
                description VARCHAR(100) NOT NULL,
                fileEvidences VARCHAR(60) NOT NULL,
                activityId INT NOT NULL,
                PRIMARY KEY (id)
);


ALTER TABLE Activity ADD CONSTRAINT users_activity_fk
FOREIGN KEY (userId)
REFERENCES Users (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Manager ADD CONSTRAINT users_director_fk
FOREIGN KEY (UserId)
REFERENCES Users (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Files ADD CONSTRAINT institution_files_fk
FOREIGN KEY (institutionId)
REFERENCES Institution (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Manager ADD CONSTRAINT institution_director_fk
FOREIGN KEY (InstitutionId)
REFERENCES Institution (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Evidences ADD CONSTRAINT activity_evidences_fk
FOREIGN KEY (activityId)
REFERENCES Activity (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
