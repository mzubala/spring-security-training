CREATE TABLE IF NOT EXISTS `product` (
     `id` INT NOT NULL IDENTITY,
     `name` VARCHAR(45) NULL,
     `owner` VARCHAR(45) NULL,
PRIMARY KEY (`id`));