-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: projeto_bd
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_amizade`
--

DROP TABLE IF EXISTS `tb_amizade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_amizade` (
  `id_user_logado` int(11) NOT NULL,
  `id_amigo` int(11) NOT NULL,
  PRIMARY KEY (`id_amigo`,`id_user_logado`),
  KEY `fk_usuario` (`id_user_logado`),
  CONSTRAINT `fk_amigos` FOREIGN KEY (`id_amigo`) REFERENCES `tb_usuario` (`id_usuario`),
  CONSTRAINT `fk_usuario` FOREIGN KEY (`id_user_logado`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_bloq_memb_grupo`
--

DROP TABLE IF EXISTS `tb_bloq_memb_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_bloq_memb_grupo` (
  `id_bloq_memb` int(11) NOT NULL AUTO_INCREMENT,
  `id_grupo` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id_bloq_memb`),
  KEY `fk_bloq_grupo` (`id_grupo`),
  KEY `fk_user_bloq_grup` (`id_usuario`),
  CONSTRAINT `fk_bloq_grupo` FOREIGN KEY (`id_grupo`) REFERENCES `tb_grupo` (`id_grupo`),
  CONSTRAINT `fk_user_bloq_grup` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_bloqueio_amizade`
--

DROP TABLE IF EXISTS `tb_bloqueio_amizade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_bloqueio_amizade` (
  `id_user_bloqueante` int(11) NOT NULL,
  `id_user_bloqueado` int(11) NOT NULL,
  PRIMARY KEY (`id_user_bloqueado`,`id_user_bloqueante`),
  KEY `fk_user_bloq_amiz` (`id_user_bloqueante`),
  CONSTRAINT `fk_amigo_bloq_amiz` FOREIGN KEY (`id_user_bloqueado`) REFERENCES `tb_usuario` (`id_usuario`),
  CONSTRAINT `fk_user_bloq_amiz` FOREIGN KEY (`id_user_bloqueante`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_comentario_post`
--

DROP TABLE IF EXISTS `tb_comentario_post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_comentario_post` (
  `id_comentario` int(11) NOT NULL AUTO_INCREMENT,
  `id_post` int(11) NOT NULL,
  `id_user_coment` int(11) NOT NULL,
  `imagem` varchar(50) DEFAULT NULL,
  `conteudo` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id_comentario`),
  KEY `fk_post` (`id_post`),
  KEY `fk_user_coment` (`id_user_coment`),
  CONSTRAINT `fk_post` FOREIGN KEY (`id_post`) REFERENCES `tb_post` (`id_post`),
  CONSTRAINT `fk_user_coment` FOREIGN KEY (`id_user_coment`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_grupo`
--

DROP TABLE IF EXISTS `tb_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_grupo` (
  `id_grupo` int(11) NOT NULL AUTO_INCREMENT,
  `id_criador` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `imagem` varchar(50) DEFAULT NULL,
  `conteudo` varchar(500) DEFAULT NULL,
  `visibilidade` char(2) DEFAULT '1',
  PRIMARY KEY (`id_grupo`),
  KEY `id_criador_idx` (`id_criador`),
  CONSTRAINT `id_criador` FOREIGN KEY (`id_criador`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_membros_grupo`
--

DROP TABLE IF EXISTS `tb_membros_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_membros_grupo` (
  `id_memb_grup` int(11) NOT NULL AUTO_INCREMENT,
  `id_grupo` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `administrador` char(1) NOT NULL,
  PRIMARY KEY (`id_memb_grup`),
  KEY `fk_grupo` (`id_grupo`),
  KEY `fk_user_grupo` (`id_usuario`),
  CONSTRAINT `fk_grupo` FOREIGN KEY (`id_grupo`) REFERENCES `tb_grupo` (`id_grupo`),
  CONSTRAINT `fk_user_grupo` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_post`
--

DROP TABLE IF EXISTS `tb_post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_post` (
  `id_post` int(11) NOT NULL AUTO_INCREMENT,
  `id_user_post` int(11) NOT NULL,
  `imagem` varchar(50) DEFAULT NULL,
  `conteudo` varchar(500) DEFAULT NULL,
  `visibilidade` char(2) DEFAULT NULL,
  PRIMARY KEY (`id_post`),
  KEY `fk_user_port` (`id_user_post`),
  CONSTRAINT `fk_user_port` FOREIGN KEY (`id_user_post`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_post_grupo`
--

DROP TABLE IF EXISTS `tb_post_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_post_grupo` (
  `id_post` int(11) NOT NULL,
  `id_grupo_post` int(11) NOT NULL,
  KEY `fk_grup_post` (`id_post`),
  KEY `fk_grup_post_esp` (`id_grupo_post`),
  CONSTRAINT `fk_grup_post` FOREIGN KEY (`id_post`) REFERENCES `tb_post` (`id_post`),
  CONSTRAINT `fk_grup_post_esp` FOREIGN KEY (`id_grupo_post`) REFERENCES `tb_grupo` (`id_grupo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_post_usuario`
--

DROP TABLE IF EXISTS `tb_post_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_post_usuario` (
  `id_post` int(11) NOT NULL,
  `id_user_post` int(11) NOT NULL,
  KEY `fk_post_esp` (`id_post`),
  KEY `fk_user_post_esp` (`id_user_post`),
  CONSTRAINT `fk_post_esp` FOREIGN KEY (`id_post`) REFERENCES `tb_post` (`id_post`),
  CONSTRAINT `fk_user_post_esp` FOREIGN KEY (`id_user_post`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_resposta_coment`
--

DROP TABLE IF EXISTS `tb_resposta_coment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_resposta_coment` (
  `id_resposta` int(11) NOT NULL AUTO_INCREMENT,
  `id_comentario` int(11) NOT NULL,
  `id_user_resp` int(11) NOT NULL,
  `imagem` varchar(50) DEFAULT NULL,
  `conteudo` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id_resposta`),
  KEY `fk_comentario` (`id_comentario`),
  KEY `fk_user_resp` (`id_user_resp`),
  CONSTRAINT `fk_comentario` FOREIGN KEY (`id_comentario`) REFERENCES `tb_comentario_post` (`id_comentario`),
  CONSTRAINT `fk_user_resp` FOREIGN KEY (`id_user_resp`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_solic_memb_grupo`
--

DROP TABLE IF EXISTS `tb_solic_memb_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_solic_memb_grupo` (
  `id_solic_memb` int(11) NOT NULL AUTO_INCREMENT,
  `id_grupo` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id_solic_memb`),
  KEY `fk_solic_grupo` (`id_grupo`),
  KEY `fk_user_solic_grup` (`id_usuario`),
  CONSTRAINT `fk_solic_grupo` FOREIGN KEY (`id_grupo`) REFERENCES `tb_grupo` (`id_grupo`),
  CONSTRAINT `fk_user_solic_grup` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_solicit_amizade`
--

DROP TABLE IF EXISTS `tb_solicit_amizade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_solicit_amizade` (
  `id_user_solicitante` int(11) NOT NULL,
  `id_user_solicitado` int(11) NOT NULL,
  PRIMARY KEY (`id_user_solicitado`,`id_user_solicitante`),
  KEY `fk_user_solic_amiz` (`id_user_solicitante`),
  CONSTRAINT `fk_amigo_solic_amiz` FOREIGN KEY (`id_user_solicitado`) REFERENCES `tb_usuario` (`id_usuario`),
  CONSTRAINT `fk_user_solic_amiz` FOREIGN KEY (`id_user_solicitante`) REFERENCES `tb_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `foto` varchar(50) DEFAULT NULL,
  `senha` varchar(20) NOT NULL,
  `login` varchar(100) NOT NULL,
  `visibilidade` char(2) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping events for database 'projeto_bd'
--

--
-- Dumping routines for database 'projeto_bd'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-06  2:44:54
