-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 25, 2022 at 01:59 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gtickets`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrateur`
--

DROP TABLE IF EXISTS `administrateur`;
CREATE TABLE IF NOT EXISTS `administrateur` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `administrateur`
--

INSERT INTO `administrateur` (`id`, `email`, `nom`, `prenom`) VALUES
(2, 'admin@gmail.com', 'admin', 'admin'),
(7, 'memed@gmail.com', 'memed', 'memed');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id` bigint(20) NOT NULL,
  `age` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id`, `age`, `email`, `nom`, `prenom`) VALUES
(1, 19, 'med@gmail.com', 'mohammed', 'benkhazra'),
(16, 0, 'nasima@gmail.com', 'ghoujdi', 'nasima'),
(17, 20, 'oussama@gmail.com', 'benkhazra', 'oussama');

-- --------------------------------------------------------

--
-- Table structure for table `developpeur`
--

DROP TABLE IF EXISTS `developpeur`;
CREATE TABLE IF NOT EXISTS `developpeur` (
  `id` bigint(20) NOT NULL,
  `age` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `specialite` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `developpeur`
--

INSERT INTO `developpeur` (`id`, `age`, `email`, `nom`, `prenom`, `specialite`) VALUES
(1, 25, 'badr@gmail.com', 'benani', 'badr', 'developpeur web'),
(2, 25, 'ayoub@gmail.com', 'narag', 'ayoub', 'dev mobile'),
(3, 16, 'zakaria@gmail.com', 'chakir', 'zakaria', 'dev web'),
(4, 30, 'meriem@gmail.com', 'narase', 'meriem', 'dev mobile');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(30);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'ROLE_CLIENT'),
(2, 'ROLE_DEVELOPPEUR'),
(3, 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
CREATE TABLE IF NOT EXISTS `ticket` (
  `id` bigint(20) NOT NULL,
  `date_fermeture` date DEFAULT NULL,
  `date_ouverture` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `environnement` varchar(255) DEFAULT NULL,
  `logiciel` varchar(255) DEFAULT NULL,
  `priorite` varchar(255) DEFAULT NULL,
  `statut` varchar(255) DEFAULT NULL,
  `titre` varchar(255) DEFAULT NULL,
  `client_id` bigint(20) DEFAULT NULL,
  `dev_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKj2rjr6m31hp7m00tm1hdxckov` (`client_id`),
  KEY `FKh2hv0s1nhsht1xjh1whsn5u59` (`dev_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`id`, `date_fermeture`, `date_ouverture`, `description`, `environnement`, `logiciel`, `priorite`, `statut`, `titre`, `client_id`, `dev_id`) VALUES
(1, '2022-05-24', '2022-05-25', 'description modifiedsdggfdqg', 'Windows', 'kasperskyModif', 'urgent', 'résolu', 'panne de reseau', NULL, NULL),
(9, NULL, '2022-05-20', 'sqgdfshgfdjfhhhhhhhhhhhhhhhhhhhhsf', 'android', 'e-commece', 'urgent', 'résolu', 'panne3', NULL, 1),
(15, '2022-05-30', '2022-05-18', 'modiffdffgfdsgdsgdfshqfg', 'Android', 'dfsffdgds', 'non urgent', 'en cours de traitement', 'modgfsdgsdggfgsdgfdsg', 1, 1),
(16, '2022-05-09', '2022-05-27', 'esfgggggggggggggggggg', 'windows', 'webstorm', 'urgent', 'en cours de traitement', 'somthing', 1, 1),
(17, '2022-05-02', '2022-05-31', 'stgedhht', 'Windows', 'hpSupportModif', 'urgent', 'résolu', 'panne sth', 1, 1),
(20, '2022-05-26', '2022-05-30', 'rgkletdgkjkdgbhjkerjsfkvjksjfk', 'Windows', 'WhatsapDesktop', 'normale', 'en cours de traitement', 'inexecutable', 1, NULL),
(22, NULL, '2022-05-24', 'dsgdfgdfkghjkrsghjkhrs', 'Windows', 'sdfsg', 'critique', 'en cours de traitement', 'test', 1, NULL),
(23, NULL, '2022-05-24', 'fxghdfsgjnsqjkghjqsghhfhjqsh', 'Linux', 'sgdfsg', 'urgent', 'en cours de traitement', 'test2', 1, NULL),
(24, NULL, '2022-05-24', 'sqdqgdfsghdfh', 'Linux', 'fsdgs', 'urgent', 'en cours de traitement', 'test3', 1, NULL),
(25, NULL, '2022-05-24', 'sdgqrrdgihdsghkj', 'Linux', 'fsdgdsfg', 'urgent', 'en cours de traitement', 'test4', 1, NULL),
(26, NULL, '2022-05-24', 'sqdgfsgdfs', 'IOS', 'sfgdsfhfd', 'critique', 'en cours de traitement', 'test5', 1, NULL),
(27, NULL, '2022-05-24', 'fsghfdhdfh', 'Android', 'sfsgq', 'critique', 'en cours de traitement', 'test6', NULL, NULL),
(28, '2022-05-28', '2022-05-24', 'sqffgdfghdgh', 'Windows', 'dsg', 'critique', 'résolu', 'tickets', 1, 1),
(29, NULL, '2022-05-25', 'ddsgdfgndfskdghkjdgk', 'Windows', 'sfsdg', 'urgent', 'en cours de traitement', 'panne', 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `client` bigint(20) DEFAULT NULL,
  `developpeur` bigint(20) DEFAULT NULL,
  `administrateur` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`),
  KEY `FKjkgw8x7yeme4ffwdk6byaotew` (`administrateur`),
  KEY `FKt2ocwdd0t31025oyciiskj242` (`client`),
  KEY `FK1pmkaoh9xdh2527tc53ympx3h` (`developpeur`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `username`, `client`, `developpeur`, `administrateur`) VALUES
(1, 'med@gmail.com', '$2a$10$Be7S1RA7W1F.dUO5nPdZ2.VEMK/keV7ARhLgtXn2NCqooVOL522Ci', 'med', 1, NULL, NULL),
(2, 'admin@gmail.com', '$2a$10$lo8LF4pAnp3ummEgCRggxuP9a66.jjO82a8bBIlCi5nAH.rgQEmzu', 'admin', NULL, NULL, 2),
(3, 'oussama@gmail.com', '$2a$10$ZOOS6Wamldekf4Hl5LqxG.hzM0ujRXjhnGNdnKos.xDIlMVyZE/gG', 'oussama', 17, NULL, NULL),
(4, 'achraf@gmail.com', '$2a$10$BSVBMcpc4WLtbD7OxSy6F./ghNyg4z7y0VZFKuqG1.jzmP3neiu/G', 'achraf', NULL, NULL, NULL),
(5, 'nasima@gmail.com', '$2a$10$F8G61bKT6HxLrtPndXeUoul/w6Iao13qNjge/f3/unEX/Qz7mCBTy', 'nasima', 16, NULL, NULL),
(7, 'zakaria@gmail.com', '$2a$10$ydL3W7oCcICN6N/Zhf56LO0yoJ6zldRXc0zIsDUaB0iZiqTVA4mFu', 'zakaria', NULL, 3, NULL),
(8, 'badr@gmail.com', '$2a$10$8twbViKhhCNf2D82SptnKO2CuFYB8TOkNAaGI.AqlNHli69IgBRNu', 'badr', NULL, 1, NULL),
(9, 'ayoub@gmail.com', '$2a$10$Xy8ewyabdLKgW4/62t8/9eHtRFv.1msT2tDxCrvwzgDiTQ95ORjPO', 'ayoub', NULL, 2, NULL),
(10, 'meriem@gmail.com', '$2a$10$CSTIVG9RpQHmnXamP8OjQ.q80YL5QYkzwibPnR6EdaQiZz57Hd15O', 'meriem', NULL, 4, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE IF NOT EXISTS `user_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKh8ciramu9cc9q3qcqiv4ue8a6` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_roles`
--

INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES
(1, 1),
(2, 3),
(3, 1),
(4, 1),
(5, 1),
(7, 2),
(8, 2),
(9, 2),
(10, 2);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `FKh2hv0s1nhsht1xjh1whsn5u59` FOREIGN KEY (`dev_id`) REFERENCES `developpeur` (`id`),
  ADD CONSTRAINT `FKj2rjr6m31hp7m00tm1hdxckov` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
