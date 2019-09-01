CREATE DATABASE  IF NOT EXISTS `web_artist_tracker`;
USE `web_artist_tracker`;
-- MySQL dump 10.13  Distrib 5.6.13, for osx10.6 (i386)
--
-- Host: 127.0.0.1    Database: web_artist_tracker
-- ------------------------------------------------------
-- Server version	5.6.16

--
-- Table structure for table `artist`
--

DROP TABLE IF EXISTS `artist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `artist`
--

LOCK TABLES `artist` WRITE;


INSERT INTO `artist` VALUES 
	(1,'David','Wang','david@gmail.com'),
	(2,'John','Lee','john@gmail.com'),
	(3,'Ajay','Huang','ajay@gmail.com'),
	(4,'Mary','Wu','mary@gmail.com'),
	(5,'Cheng','Liu','chengliu@gmail.com');


UNLOCK TABLES;


-- Dump completed on 2019-01-24 21:50:59
