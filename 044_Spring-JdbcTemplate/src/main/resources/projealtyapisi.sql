CREATE SCHEMA `firmadb` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;

CREATE TABLE `firmadb`.`personel` (
  `id` INT NOT NULL,
  `adi` VARCHAR(45) NULL,
  `soyadi` VARCHAR(45) NULL,
  `tecrube` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

SELECT * FROM firmadb.personel;
