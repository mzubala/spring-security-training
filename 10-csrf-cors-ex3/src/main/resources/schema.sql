CREATE TABLE IF NOT EXISTS `token` (
    `id` INT NOT NULL IDENTITY,
    `identifier` VARCHAR(45) NULL,
    `token` TEXT NULL,
PRIMARY KEY (`id`));
