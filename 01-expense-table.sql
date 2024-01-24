CREATE DATABASE  IF NOT EXISTS `expense_directory`;
USE `expense_directory`;


CREATE TABLE `expense` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `amount` float DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Inserting sample expenses
INSERT INTO `expense` (`name`, `amount`, `date`) VALUES
  ('Groceries', 50.50, '2024-01-23'),
  ('Utilities', 100.15, '2024-01-22'),
  ('Dinner with friends', 30.0, '2024-01-20'),
  ('Office supplies', 25.89, '2024-01-18'),
  ('Transportation', 20.0, '2024-01-15');

