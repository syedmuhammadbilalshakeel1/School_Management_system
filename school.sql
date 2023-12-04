-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3310
-- Generation Time: Oct 30, 2023 at 03:36 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `school`
--

-- --------------------------------------------------------

--
-- Table structure for table `allstudents`
--

CREATE TABLE `allstudents` (
  `ID` varchar(20) NOT NULL,
  `Name` text NOT NULL,
  `F_Name` text NOT NULL,
  `Class` varchar(20) NOT NULL,
  `Phone` int(20) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Gender` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `allstudents`
--

INSERT INTO `allstudents` (`ID`, `Name`, `F_Name`, `Class`, `Phone`, `Address`, `Date`, `Gender`) VALUES
('csc-21f-005', 'Abdul Rehman', 'Gul Rehman', '9th', 3216666, 'Multan, Pakistan', '6/19/20 4:19 PM', 'Male'),
('csc-21f-006', 'Shahzain Khan ', 'Sharafat Ali', '7th', 3123333, 'Lahore,Pakistan', '6/10/20 4:17 PM', 'Male'),
('csc-21f-037', 'Haris Khan', 'Muhammad Imtiaz', '8th', 310121212, 'HNO.123, xyz street, Karachi', '6/15/21 12:00 AM', 'Male'),
('csc-21f-04', 'hunzila ', 'naseem', '9th', 306766, 'gulistan-e-johar', '6/12/23 12:35 PM', 'Male'),
('csc-21f-87', 'hammad', 'hussain', '12', 564388, 'xyz', '6/12/23 12:00 AM', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `attendence`
--

CREATE TABLE `attendence` (
  `ID` varchar(20) NOT NULL,
  `Name` text NOT NULL,
  `Class` varchar(20) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendence`
--

INSERT INTO `attendence` (`ID`, `Name`, `Class`, `Date`, `Status`) VALUES
('csc-21f-003', 'Taufail', 'Matric', '6/4/23 11:32 AM', 'Present'),
('csc-21f-005', 'Abdul Rehman', '8th', '6/6/23 5:02 PM', 'Present'),
('csc-21f-006', 'Shahzain Khan', '6th', '6/14/23 5:02 PM', 'Absent'),
('csc-21f-033', 'umer Khan', 'Matric', '6/7/23 8:01 PM', 'Present'),
('csc-21f-037', 'Haris', 'Matric', '6/12/23 5:01 PM', 'Present'),
('csc-21f-042', 'hunzila', '12', '6/15/23 12:00 AM', 'Present');

-- --------------------------------------------------------

--
-- Table structure for table `fees`
--

CREATE TABLE `fees` (
  `SNO` int(10) NOT NULL,
  `ID` varchar(20) NOT NULL,
  `Name` text NOT NULL,
  `F_Name` text NOT NULL,
  `Class` varchar(20) NOT NULL,
  `Gender` text NOT NULL,
  `Fee_Date` varchar(20) NOT NULL,
  `Fee` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `fees`
--

INSERT INTO `fees` (`SNO`, `ID`, `Name`, `F_Name`, `Class`, `Gender`, `Fee_Date`, `Fee`) VALUES
(4, 'csc-21f-006', 'Shahzain Khan', 'Sharafat Ali', '8th', 'Male', '6/5/23 4:44 PM', '3000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Username` text NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `Password`) VALUES
('haris', '123');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `SNO` int(5) NOT NULL,
  `ID` varchar(20) NOT NULL,
  `Name` char(50) NOT NULL,
  `F_Name` char(50) NOT NULL,
  `Class` varchar(20) NOT NULL,
  `Subject1` varchar(20) NOT NULL,
  `Subject2` varchar(20) NOT NULL,
  `Subject3` varchar(20) NOT NULL,
  `Subject4` varchar(20) NOT NULL,
  `Subject5` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`SNO`, `ID`, `Name`, `F_Name`, `Class`, `Subject1`, `Subject2`, `Subject3`, `Subject4`, `Subject5`) VALUES
(6, 'csc-21f-037', 'Haris Khan', 'Muhammad Imtiaz', '8th', '100', '88', '88', '88', '88');

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `SNO` int(5) NOT NULL,
  `Name` text NOT NULL,
  `Specialization` text NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Phone` int(11) NOT NULL,
  `Salary` varchar(20) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Gender` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teachers`
--

INSERT INTO `teachers` (`SNO`, `Name`, `Specialization`, `Email`, `Phone`, `Salary`, `Address`, `Date`, `Gender`) VALUES
(1, 'Dr. Sarmad', 'DBMS', 'xyz@gmail.com', 3448888, '35000', 'Karachi, Pakistan', '6/14/21 4:23 PM', 'Male'),
(2, 'Aisha', 'Philosophy', 'abc@gmail.com', 316222222, '26000', 'Karachi, Pakistan', '6/14/18 4:24 PM', 'Female'),
(3, 'Nazia Ashraf', 'DSA', 'yyy@gamil.com', 3330000, '22000', 'Hyderabad, Pakistan', '6/14/21 4:26 PM', 'Female'),
(5, 'hammad', 'cs', 'hammad@gmail.com', 37896756, '35000', 'gulistanejohar', '6/14/23 12:00 AM', 'Male');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `allstudents`
--
ALTER TABLE `allstudents`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `attendence`
--
ALTER TABLE `attendence`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `fees`
--
ALTER TABLE `fees`
  ADD PRIMARY KEY (`SNO`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`SNO`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`SNO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `fees`
--
ALTER TABLE `fees`
  MODIFY `SNO` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `SNO` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `teachers`
--
ALTER TABLE `teachers`
  MODIFY `SNO` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
