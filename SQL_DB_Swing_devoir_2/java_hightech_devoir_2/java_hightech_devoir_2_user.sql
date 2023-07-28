-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: java_hightech_devoir_2
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `national_code` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `adress` varchar(50) DEFAULT NULL,
  `mobile_no` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  PRIMARY KEY (`national_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('AA12345','Youssef','Ben','Kenitra','0654269837','benyoussef@gmail.com','XBAlfLfSIk','Receptionist'),('BB12345','Karima','CHIBI','Temara','0736954821','chibi@gmail.com','fHUM4bR49a','Doctor'),('C12345','Moncef','SENHAJI','Souira','0649823167','senhaji@gmail.com','123456789','Admin'),('D12345','Souhayla','MILANO','Boujdour','0674395265','milano@gmail.com','d2PfJcZlKA','Lab Assistant'),('F12345','Mohamed','HAMOUDI','Kiev','0642369517','hamoudi@gmail.com','74Q0LKwIhx','Doctor'),('G12345','Aymane','SERRAJ','Bremen','0643985716','serraj@gmail.com','8GxnaU2C&k','Doctor'),('H12345','Loay','LAMRINI','Lusane - Suisse','0682341568','lamrini@gmail.com','jpEEEIHQ%x','Doctor'),('J12345','Layla','BENNANI','Bruxelle - Belgique','0643256781','bennani@gmail.com','q8tnVb0e7N','Pharmacist'),('K12345','Layla','Benjelloun','Casablanca','0674369582','benjelloun@gmail.com','KfAlylf#yB','Lab Assistant'),('L12345','Salma','SERGHINI','Amsterdam','0671342586','serghini@gmail.com','E0DVyd4suy','Doctor'),('M12345','Youssra','MARRAKCHI','Marrakcech','0634952871','marrakchi@gmail.com','!IhN#tkj47','Pharmacist'),('Q12345','Karim','BERNOUSSI','Oujda','0634968579','bernoussi@gmail.com','xQYI!eM%5s','Patient'),('S12345','Manal','Siham','Toronto - Canada','0694326854','soussi@gmail.com','123456789','Admin'),('ZZ12345','Youssra','EL KABRITI','Salé ','0785369421','elkabriti@gmail.com','PYSGS8VHL4','Patient');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-28 20:53:59
