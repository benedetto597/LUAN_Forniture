CREATE TABLE `Fornitures`(
    `pk_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `fk_category` INT NOT NULL,
    `fk_dimensions` INT NOT NULL,
    `fk_cloth` INT NULL,
    `fk_suplier` INT NOT NULL,
    `var_name` VARCHAR(255) NOT NULL,
    `flt_base_price` DOUBLE(8, 2) NOT NULL
);
CREATE TABLE `Categories`(
    `pk_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `var_name` VARCHAR(255) NOT NULL,
    `uk_code` VARCHAR(255) NOT NULL,
    `fk_main_category` INT NULL
);
ALTER TABLE
    `Categories` ADD UNIQUE `categories_uk_code_unique`(`uk_code`);
CREATE TABLE `Dimensions`(
    `pk_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `flt_height` DOUBLE(8, 2) NOT NULL,
    `flt_width` DOUBLE(8, 2) NOT NULL,
    `flt_depth` DOUBLE(8, 2) NOT NULL
);
CREATE TABLE `Clothes`(
    `pk_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `var_code` VARCHAR(255) NOT NULL,
    `chr_color` CHAR(255) NOT NULL
);
ALTER TABLE
    `Clothes` ADD UNIQUE `clothes_var_code_unique`(`var_code`);
CREATE TABLE `Supliers`(
    `pk_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `chr_name` CHAR(255) NOT NULL,
    `chr_contact_name` CHAR(255) NOT NULL,
    `int_contact_phone` INT NOT NULL
);
CREATE TABLE `Orders`(
    `pk_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `fk_id_customer` INT NOT NULL,
    `var_code` VARCHAR(255) NOT NULL,
    `bol_status` TINYINT(1) NOT NULL,
    `dat_datetime` DATETIME NOT NULL,
    `flt_total_price` DOUBLE(8, 2) NOT NULL,
    `flt_total_discount` DOUBLE(8, 2) NOT NULL,
    `flt_total_delivery` DOUBLE(8, 2) NOT NULL
);
ALTER TABLE
    `Orders` ADD UNIQUE `orders_var_code_unique`(`var_code`);
CREATE TABLE `Order_Items`(
    `pk_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `fk_id_order` INT NOT NULL,
    `fk_id_forniture` INT NOT NULL,
    `int_quantity` INT NOT NULL,
    `flt_base_price` INT NOT NULL,
    `int_discount` INT NOT NULL,
    `flt_delivery` INT NOT NULL
);
ALTER TABLE
    `Fornitures` ADD CONSTRAINT `fornitures_fk_category_foreign` FOREIGN KEY(`fk_category`) REFERENCES `Categories`(`pk_id`);
ALTER TABLE
    `Categories` ADD CONSTRAINT `categories_fk_main_category_foreign` FOREIGN KEY(`fk_main_category`) REFERENCES `Categories`(`pk_id`);
ALTER TABLE
    `Fornitures` ADD CONSTRAINT `fornitures_fk_dimensions_foreign` FOREIGN KEY(`fk_dimensions`) REFERENCES `Dimensions`(`pk_id`);
ALTER TABLE
    `Fornitures` ADD CONSTRAINT `fornitures_fk_cloth_foreign` FOREIGN KEY(`fk_cloth`) REFERENCES `Clothes`(`pk_id`);
ALTER TABLE
    `Fornitures` ADD CONSTRAINT `fornitures_fk_suplier_foreign` FOREIGN KEY(`fk_suplier`) REFERENCES `Supliers`(`pk_id`);
ALTER TABLE
    `Order_Items` ADD CONSTRAINT `order_items_fk_id_order_foreign` FOREIGN KEY(`fk_id_order`) REFERENCES `Orders`(`pk_id`);
ALTER TABLE
    `Order_Items` ADD CONSTRAINT `order_items_fk_id_forniture_foreign` FOREIGN KEY(`fk_id_forniture`) REFERENCES `Fornitures`(`pk_id`);