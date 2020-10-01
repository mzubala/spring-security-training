CREATE TABLE IF NOT EXISTS `workout` (
  `id` INT NOT NULL IDENTITY,
  `user` VARCHAR(45) NULL,
  `start` DATETIME NULL,
  `end` DATETIME NULL,
  `difficulty` INT NULL,
  PRIMARY KEY (`id`));
