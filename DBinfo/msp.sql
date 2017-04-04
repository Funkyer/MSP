SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `msp` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `msp` ;

-- -----------------------------------------------------
-- Table `msp`.`t_content`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `msp`.`t_content` (
  `id` INT NOT NULL ,
  `name` VARCHAR(128) NOT NULL ,
  `introduce` VARCHAR(256) NULL ,
  `lang` VARCHAR(45) NULL ,
  `vodType` INT NOT NULL ,
  `detailType` VARCHAR(45) NULL ,
  `artist` VARCHAR(45) NULL ,
  `particularDate` VARCHAR(45) NULL ,
  `poster` VARCHAR(256) NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `T_CONTENT_ARTIST_INDEX` (`artist` ASC) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
