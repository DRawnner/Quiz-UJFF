-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 14-Fev-2020 às 00:57
-- Versão do servidor: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quiz`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `perguntas`
--

CREATE TABLE `perguntas` (
  `id` int(11) NOT NULL,
  `pergunta` varchar(80) NOT NULL,
  `opcao1` varchar(80) NOT NULL,
  `opcao2` varchar(80) NOT NULL,
  `opcao3` varchar(80) NOT NULL,
  `opcao4` varchar(80) NOT NULL,
  `resposta` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `perguntas`
--

INSERT INTO `perguntas` (`id`, `pergunta`, `opcao1`, `opcao2`, `opcao3`, `opcao4`, `resposta`) VALUES
(1, 'Quem foi o conde D`Essex?', 'Monarca que residia na cidade', 'Primeiro presidente da Junta', 'Corsário Inglês que destruiu Faro', 'Governador da Região', 'Corsário Inglês que destruiu Faro'),
(2, 'Qual o Rei que elevou Faro a cidade?', 'D. Afonso III', 'D. João III', 'D. Dinis', 'D. Manuel', 'D. João III'),
(3, 'Em que ano ocorreu a unificação das juntas de freguesia da Sé e São Pedro?', '2017', '2013', '2009', '2005', '2013'),
(4, 'Em que ano foi inaugurado o Arco da Vila?', '1812', '1540', '1674', '1250', '1812'),
(5, 'Qual o nome do presidente da União das Freguesias de Faro?', 'Jorge Jesus', 'Jorge Pereira', ' José Inácio', ' Bruno Lage', ' Bruno Lage'),
(6, 'Em que mês ocorre a Feira do Doce Regional e Conventual de Faro?', 'Agosto', 'Julho', 'Abril', 'Dezembro', 'Agosto'),
(7, 'Se estivermos a navegar pelos canais da Ria Formosa, qual a distância aproximada', ' 7 km ', '9 km', '12 km ', '5 km', '9 km'),
(8, 'Em que ano ocorreu a unificação das juntas de freguesia da Sé e São Pedro?', '2017', '2013', '2009', '2005', '2013'),
(9, 'De acordo com os Censos 2011 qual o número aproximado de habitantes na Freguesia', '152 km2', '108 km2', '73 km2', '45 km2', '73 km2'),
(10, 'Em que mês ocorre habitualmente a Feira dos Queijos, Vinhos e Enchidos?', 'Agosto', 'Novembro', 'Junho', 'Abril', 'Abril'),
(11, 'Em que ano foi inaugurado o Hospital Distrital de Faro (atualmente Centro Hospit', '1935', '1995', '1979', '1919', '1979'),
(12, 'A Ria Formosa é constituída por duas penínsulas e várias ilhas barreira. Quantas', '1', '3', '2', '4', '2'),
(13, 'Em que ano Faro foi conquistado aos Mouros?', '1249', '970', '1110', '1500', '1249'),
(14, 'A União das Freguesias de Faro tem uma área aproximada de:', '3 de dezembro de 2003 ', '7 de setembro de 2010', '8 de Fevereiro de 2007 ', ' 6 de junho de 1998', '8 de Fevereiro de 2007 '),
(15, 'Quantos lugares de estacionamento tem o Largo de São Francisco? Quem é o atual p', 'José Vitorino', 'António Costa', 'José Inácio ', 'Rogério Bacalhau', 'Rogério Bacalhau'),
(16, 'O Sport Faro e Benfica a filial do Sport Lisboa e Benfica número:', '2', '1', '5', '10', '1'),
(17, 'Qual é o Santo Padroeiro da cidade de Faro?', 'São Pedro', 'São Tomás de Aquino', 'São Francisco de Assis ', 'Santo António', 'São Tomás de Aquino'),
(18, 'Qual a nacionalidade do arquiteto que projetou o Arco da Vila?', 'Sueca', 'Francesa', 'Portuguesa', 'Italiana', 'Italiana'),
(19, 'Em que ano ocorreu o terramoto e tsunami que assolou a cidade de Faro?', '1565', '1942', '1755', '1842', '1755'),
(20, 'Em que dia foi inaugurada a Estação Ferroviária de Faro?', '1 de julho de 1889 ', '12 de agosto de 1765', '3 de agosto de 1921', '21 de março de 1819', '1 de julho de 1889 '),
(21, 'Para além da sede, quantas delegações tem a União das Freguesias de Faro?', '1', '4', '3', '2', '3'),
(22, 'Qual é a rua mais comprida da cidade de Faro?', 'Rua de São Luís ', 'Rua de Santo António', 'Rua Baptista Lopes', 'Rua Reitor Teixeira Guedes', 'Rua Reitor Teixeira Guedes'),
(23, 'Quem foi D. Francisco Gomes do Avelar?', 'Bispo do Algarve ', 'Carpinteiro e entalhador', 'Estratega militar ', 'Pintor farense', 'Bispo do Algarve '),
(24, 'Quem foi Francisco Xavier Fabri?', 'Governador da cidade ', 'Oficial da Marinha de Guerra Portuguesa', 'Pasteleiro', 'Arquiteto', 'Arquiteto'),
(25, 'O Teatro Municipal de Faro também é conhecido pelo nome de:', 'Teatro Ria Formosa', 'Teatro Ossónoba', 'Teatro Lethes', 'Teatro das Figuras', 'Teatro das Figuras'),
(26, 'O Sporting Clube Farense é a filial do Sporting Clube de Portugal número:', '1', '2', '5', '10', '2'),
(27, 'Qual o rei que conquistou Faro aos Mouros?', 'D. Afonso Henriques', 'D. Sancho I', 'D. Afonso III ', 'D. Dinis', 'D. Afonso III '),
(28, 'Em que ano a Rua de Santo António se tornou pedonal?', '1852', '1921', '1970', '1995', '1970'),
(29, 'Qual o nome do mestre calceteiro que executou a calçada portuguesa da Rua de San', 'Mestre Perdigão ', 'Mestre Américo', 'Mestre Vargues ', 'Mestre Jardim', 'Mestre Américo'),
(30, 'Em que ano ocorreu a 1ª concentração Motard de Faro?', '1992', '2003', '1975', '1981', '1981'),
(31, 'Existe uma capela dos ossos em Faro que está na igreja:', 'São Pedro', 'São Francisco', 'Carmo', 'São Sebastião', 'Carmo'),
(32, 'A Ria Formosa tem a sua largura máxima em frente a Faro que é aproximadamente de', '5 km ', '10 km', '3 km', '1 km', '5 km '),
(33, 'Pavilhão Municipal da Penha Piscinas Municipais Quantas Escolas Secundárias exis', '3', '1', '2', '5', '3'),
(34, 'Teatro Lethes Qual o nome do Jardim da Alameda?', ' João de Deus', 'Infante D. Henrique', 'D. Dinis', 'Duarte Pacheco', ' João de Deus');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `perguntas`
--
ALTER TABLE `perguntas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `perguntas`
--
ALTER TABLE `perguntas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
