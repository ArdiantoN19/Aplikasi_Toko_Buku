-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 05, 2022 at 04:05 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tokobuku`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`, `alamat`) VALUES
('admin', 'admin', 'karanganyar'),
('ardi', 'admin', 'karanganyar');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_konsumen` varchar(15) NOT NULL,
  `nama_konsumen` varchar(30) NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_konsumen`, `nama_konsumen`, `tempat_lahir`, `tgl_lahir`, `alamat`) VALUES
('1', 'Rika', 'Bogor', '2001-05-18', 'Bekasi');

-- --------------------------------------------------------

--
-- Table structure for table `data_buku`
--

CREATE TABLE `data_buku` (
  `id_buku` varchar(15) NOT NULL,
  `nama_buku` varchar(50) NOT NULL,
  `nama_pengarang` char(30) NOT NULL,
  `nama_penerbit` char(30) NOT NULL,
  `jml_halaman` varchar(20) NOT NULL,
  `tahun_terbit` varchar(15) NOT NULL,
  `jumlah_stok` varchar(15) NOT NULL,
  `harga` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_buku`
--

INSERT INTO `data_buku` (`id_buku`, `nama_buku`, `nama_pengarang`, `nama_penerbit`, `jml_halaman`, `tahun_terbit`, `jumlah_stok`, `harga`) VALUES
('A004', 'Buku Pemrograman Java', 'Jerito', 'JavaKit', '210', '2017', '2', '150000'),
('A005', 'Ketika senja', 'Miranda', 'Novella', '280', '2019', '1', '120000'),
('A006', 'Ketika senja', 'Miranda', 'Novella', '280', '2019', '2', '120000'),
('A007', 'Mahir Bahasa Jepang', 'Andito', 'KitaBisa', '175', '2020', '11', '100000'),
('A008', 'Mahir Bahasa Jepang', 'Andito', 'KitaBisa', '175', '2020', '28', '100000'),
('A009', 'Senja', 'Jaka', 'TagarJakarta', '120', '2019', '20', '120000');

-- --------------------------------------------------------

--
-- Table structure for table `data_penjualan_buku`
--

CREATE TABLE `data_penjualan_buku` (
  `id_jual` varchar(20) NOT NULL,
  `id_buku` varchar(15) NOT NULL,
  `nama_buku` varchar(50) NOT NULL,
  `harga_buku` int(25) NOT NULL,
  `nama_pembeli` varchar(15) NOT NULL,
  `jumlah_buku` int(10) NOT NULL,
  `total_harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_penjualan_buku`
--

INSERT INTO `data_penjualan_buku` (`id_jual`, `id_buku`, `nama_buku`, `harga_buku`, `nama_pembeli`, `jumlah_buku`, `total_harga`) VALUES
('JJ-000001', 'A008', 'Mahir Bahasa Jepang', 100000, 'Farah', 1, 100000),
('JJ-000003', 'A007', 'Mahir Bahasa Jepang', 100000, 'Hartanto', 3, 300000),
('JJ-000004', 'A008', 'Mahir Bahasa Jepang', 100000, 'Danu', 1, 100000),
('JJ-000005', '', '', 0, '', 0, 0),
('JJ-000006', 'A005', 'Ketika senja', 120000, 'Danu', 2, 240000);

-- --------------------------------------------------------

--
-- Table structure for table `keranjang`
--

CREATE TABLE `keranjang` (
  `id_buku` varchar(15) NOT NULL,
  `nama_buku` varchar(50) NOT NULL,
  `jumlah_beli` varchar(15) NOT NULL,
  `harga` varchar(15) NOT NULL,
  `metode` varchar(15) NOT NULL,
  `nama_pembeli` varchar(30) NOT NULL,
  `alamat_pembeli` varchar(30) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `stok_sekarang` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `keranjang`
--

INSERT INTO `keranjang` (`id_buku`, `nama_buku`, `jumlah_beli`, `harga`, `metode`, `nama_pembeli`, `alamat_pembeli`, `no_telp`, `stok_sekarang`) VALUES
('A008', 'Mahir Bahasa Jepang', '1', '100000', 'Alfamart', 'Danu', 'Bogor', '089112345', '28'),
('A005', 'Ketika senja', '2', '240000', 'Alfamart', 'Danu', 'Bogor', '08900121233', '1');

-- --------------------------------------------------------

--
-- Table structure for table `keranjang1`
--

CREATE TABLE `keranjang1` (
  `id_buku` varchar(15) NOT NULL,
  `nama_buku` varchar(50) NOT NULL,
  `jumlah_beli` varchar(15) NOT NULL,
  `total` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(30) NOT NULL,
  `id_buku` varchar(15) NOT NULL,
  `nama_buku` varchar(50) NOT NULL,
  `nama_pembeli` varchar(30) NOT NULL,
  `alamat_pembeli` varchar(30) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `metode` varchar(15) NOT NULL,
  `jumlah_beli` varchar(15) NOT NULL,
  `harga_buku` varchar(15) NOT NULL,
  `total_harga` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `email`, `password`) VALUES
('ardi', 'ardi@gmail.com', '123'),
('Ardianto', 'ardi@gmail.com', 'ardi12345'),
('farhan', 'farhan@gmail.com', 'farhan'),
('farhan1', 'farhan@gmail.com', 'farhan'),
('Rika', 'rika01ningsih@gmail.com', 'rika12345'),
('tawa', 'tawa@gmail.com', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_konsumen`);

--
-- Indexes for table `data_buku`
--
ALTER TABLE `data_buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `data_penjualan_buku`
--
ALTER TABLE `data_penjualan_buku`
  ADD PRIMARY KEY (`id_jual`);

--
-- Indexes for table `keranjang1`
--
ALTER TABLE `keranjang1`
  ADD KEY `id_buku` (`id_buku`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_buku` (`id_buku`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `keranjang1`
--
ALTER TABLE `keranjang1`
  ADD CONSTRAINT `keranjang1_ibfk_1` FOREIGN KEY (`id_buku`) REFERENCES `data_buku` (`id_buku`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_buku`) REFERENCES `data_buku` (`id_buku`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
