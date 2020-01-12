-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 04, 2020 at 02:52 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `donatetest`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `category_name`) VALUES
(1, 'Clothes'),
(2, 'Food'),
(3, 'Money'),
(4, 'School Supplies');

-- --------------------------------------------------------

--
-- Table structure for table `clothes_donate`
--

CREATE TABLE `clothes_donate` (
  `id` int(11) NOT NULL,
  `item_desc` varchar(50) NOT NULL,
  `item_type` varchar(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `conditions` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `donatedto` varchar(50) NOT NULL,
  `daterec` varchar(50) NOT NULL,
  `datedon` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clothes_donate`
--

INSERT INTO `clothes_donate` (`id`, `item_desc`, `item_type`, `quantity`, `conditions`, `status`, `donatedto`, `daterec`, `datedon`) VALUES
(1, 'Women Socks', 'Socks', '5', 'New', 'Donated', 'Goodwill Foundation', '01/01/2020', '01/03/2020'),
(2, 'Men Socks', 'Socks', '2', 'New', 'Donated', 'Goodwill Foundation - Cavite Branch', '01/01/2020', '01/04/2020'),
(3, 'Unisex Shirts', 'Shirts', '10', 'New', 'Donated', 'Goodwill Foundation - Cavite Branch', '12/29/2019', '12/31/2019');

-- --------------------------------------------------------

--
-- Table structure for table `foods_donate`
--

CREATE TABLE `foods_donate` (
  `id` int(11) NOT NULL,
  `item_desc` varchar(50) NOT NULL,
  `item_type` varchar(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `donatedto` varchar(50) NOT NULL,
  `daterec` varchar(50) NOT NULL,
  `dateexp` varchar(50) NOT NULL,
  `datedon` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `foods_donate`
--

INSERT INTO `foods_donate` (`id`, `item_desc`, `item_type`, `quantity`, `status`, `donatedto`, `daterec`, `dateexp`, `datedon`) VALUES
(1, 'Corned Tuna', 'Canned Goods', '11', 'Donated', 'Earlstead Foundation', '08/14/2019', '07/08/2020', '01/03/2020'),
(2, 'Maharlika 25kg', 'Rice', '2', 'Pending', 'Earlstead Foundation', '08/14/2019', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `item_category`
--

CREATE TABLE `item_category` (
  `id` int(11) NOT NULL,
  `category` varchar(50) NOT NULL,
  `item_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `item_category`
--

INSERT INTO `item_category` (`id`, `category`, `item_name`) VALUES
(1, 'Clothes', 'Socks'),
(2, 'Clothes', 'Shirts'),
(3, 'Food', 'Canned Goods'),
(4, 'Food', 'Rice'),
(5, 'Money', 'Check'),
(6, 'Money', 'Cash'),
(7, 'School Supplies', 'Pen'),
(8, 'School Supplies', 'Notebooks'),
(9, 'Clothes', 'Pants');

-- --------------------------------------------------------

--
-- Table structure for table `money_donate`
--

CREATE TABLE `money_donate` (
  `id` int(11) NOT NULL,
  `item_desc` varchar(50) NOT NULL,
  `item_type` varchar(50) NOT NULL,
  `amount` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `donatedto` varchar(50) NOT NULL,
  `daterec` varchar(50) NOT NULL,
  `datedon` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `money_donate`
--

INSERT INTO `money_donate` (`id`, `item_desc`, `item_type`, `amount`, `status`, `donatedto`, `daterec`, `datedon`) VALUES
(1, 'Check Donation', 'Check', '10000.00', 'Donated', 'Earlstead Foundation', '01/01/2020', '01/06/2020');

-- --------------------------------------------------------

--
-- Table structure for table `school_donate`
--

CREATE TABLE `school_donate` (
  `id` int(11) NOT NULL,
  `item_desc` varchar(50) NOT NULL,
  `item_type` varchar(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `conditions` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `donatedto` varchar(50) NOT NULL,
  `daterec` varchar(50) NOT NULL,
  `datedon` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `school_donate`
--

INSERT INTO `school_donate` (`id`, `item_desc`, `item_type`, `quantity`, `conditions`, `status`, `donatedto`, `daterec`, `datedon`) VALUES
(1, 'Dong - A Fine Tech', 'Pen', '5', 'New', 'Donated', 'Goodwill Foundation', '12/31/2019', '01/05/2020'),
(2, 'ASPEN Composition', 'Notebooks', '2', 'New', 'Donated', 'Goodwill Foundation  - Manila Branch', '01/01/2020', '01/04/2020');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `middlename` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `position` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstname`, `middlename`, `lastname`, `sex`, `phone`, `position`, `email`, `password`) VALUES
(1, 'Hazel Anne', 'Libanan', 'Maramot', 'Female', '09368334992', 'Administrator', 'hazel@email.com', 'hazel'),
(2, 'Tricia Mae', 'Corneros', 'Buted', 'Female', '09123456789', 'Manager', 'tricia@email.com', 'tricia'),
(3, 'Diane', '', 'Infante', 'Female', '09987654321', 'Evaluator', 'diane@email.com', 'diane'),
(4, 'Erwin', '', 'Smith', 'Male', '09102030401', 'Volunteer', 'erwin@email.com', 'erwin'),
(5, 'Taro', 'Shinda', 'Yamada', 'Male', '12345678910', 'Volunteer', 'taroisdead@email.com', 'taro1234'),
(6, 'Beruma', 'Deiji', 'Dinkuri', 'Female', '10987654321', 'Coordinator', 'beruma@yahoo.com', 'beruma123'),
(7, 'Heizeruan', 'Bunseki suru', 'Rikoteki', 'Female', '09368334992', 'Operator', 'heizeru@email.com', 'engrhaze1'),
(8, 'Miu', '', 'Iruma', 'Female', '78945612300', 'Operator', 'iruma@email.com', 'iruma'),
(9, 'Juan', 'Antonio', 'Dela Cruz', 'Female', '(02) 506 - 1071', 'Technical Organizer', 'juandelacruz@email.com', 'juan'),
(10, 'Erwin', 'Shinda', 'Yamada', 'Male', '98754612310', 'Volunteer', 'erwin1@email.com', 'erwin12'),
(11, 'Juan', 'Deiji', 'Dela Cruz', 'Male', '789454543215', 'Organizer', 'juandelacruz@email.com', 'juandelacrruz');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clothes_donate`
--
ALTER TABLE `clothes_donate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `foods_donate`
--
ALTER TABLE `foods_donate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `item_category`
--
ALTER TABLE `item_category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `money_donate`
--
ALTER TABLE `money_donate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `school_donate`
--
ALTER TABLE `school_donate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `clothes_donate`
--
ALTER TABLE `clothes_donate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `foods_donate`
--
ALTER TABLE `foods_donate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `item_category`
--
ALTER TABLE `item_category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `money_donate`
--
ALTER TABLE `money_donate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `school_donate`
--
ALTER TABLE `school_donate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
