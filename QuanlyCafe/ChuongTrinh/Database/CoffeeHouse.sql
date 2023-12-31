/*create database CoffeeHouse*/
USE [CoffeeHouse]

CREATE TABLE [dbo].[BangLuong](
	[MaNV] [varchar](20) NOT NULL,
	[TienThuong] [int] NULL,
	[TamUng] [int] NULL,
	[Luong] [int] NULL,
 CONSTRAINT [PK_BangLuong] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]


CREATE TABLE [dbo].[ChiTietNhap](
	[MaNhap] [varchar](20) NOT NULL,
	[DVT] [varchar](20) NULL,
	[NgayNhap] [varchar](20) NULL,
	[TongTien] [int] NULL,
	[SoLuong] [int] NULL,
	[MaMon] [varchar](20) NULL,
 CONSTRAINT [PK_ChiTietNhap] PRIMARY KEY CLUSTERED 
(
	[MaNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]


CREATE TABLE [dbo].[CTHD](
	[MaHoaDon] [varchar](20) NULL,
	[MaMon] [varchar](20) NULL,
	[SoLuong] [int] NULL,
	[Gia] [int] NULL,
	[TenMon] [nvarchar](20) NULL
) ON [PRIMARY]


CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [varchar](20) NOT NULL,
	[NgayLapHD] [varchar](20) NULL,
	[ThoiGian] [varchar](20) NULL,
	[SoLuong] [int] NULL,
	[MaNV] [varchar](20) NULL,
 CONSTRAINT [PK_HoaDOn] PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]


CREATE TABLE [dbo].[Menu](
	[MaMon] [varchar](20) NOT NULL,
	[TenMon] [nvarchar](20) NULL,
	[DonGia] [int] NULL,
	[SoLuongTon] [int] NULL,
 CONSTRAINT [PK_Menu] PRIMARY KEY CLUSTERED 
(
	[MaMon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]


CREATE TABLE [dbo].[NhanVien](
	[MaNV] [varchar](20) NOT NULL,
	[TenNV] [nvarchar](20) NULL,
	[HoNV] [nvarchar](20) NULL,
	[SDT] [varchar](20) NULL,
	[GioiTinh] [nvarchar](20) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]


CREATE TABLE [dbo].[PhanCa](
	[MaNV] [varchar](20) NOT NULL,
	[HeSoLuong] [int] NULL,
	[SoGio] [int] NULL
) ON [PRIMARY]


CREATE TABLE [dbo].[TaiKhoan](
	[Username] [varchar](20) NULL,
	[Password] [varchar](20) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[BangLuong] ([MaNV], [TienThuong], [TamUng], [Luong]) VALUES (N'MaNV001', 1000000, 0, 16000000)
INSERT [dbo].[BangLuong] ([MaNV], [TienThuong], [TamUng], [Luong]) VALUES (N'MaNV002', 0, 0, 15000000)
INSERT [dbo].[BangLuong] ([MaNV], [TienThuong], [TamUng], [Luong]) VALUES (N'MaNV003', 0, 0, 2000000)
INSERT [dbo].[BangLuong] ([MaNV], [TienThuong], [TamUng], [Luong]) VALUES (N'MaNV004', 0, 100000, 1900000)
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN001', N'Ly', N'10/10/2020', 2000000, 100, N'MaMon001')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN002', N'Ly', N'10/10/2020', 2000000, 100, N'MaMon002')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN003', N'Ly', N'10/10/2020', 2000000, 100, N'MaMon003')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN004', N'Ly', N'10/10/2020', 2000000, 100, N'MaMon004')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN005', N'Ly', N'10/10/2020', 2000000, 100, N'MaMon005')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN006', N'Ly', N'10/10/2020', 2000000, 100, N'MaMon006')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN007', N'Ly', N'10/10/2020', 1000000, 100, N'MaMon007')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN008', N'Chai', N'10/10/2020', 2000000, 100, N'MaMon008')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN009', N'Chai', N'23/10/2020', 2000000, 100, N'MaMon009')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN010', N'Chai', N'10/11/2020', 2000000, 200, N'MaMon009')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN011', N'Chai', N'11/10/2020', 2000000, 200, N'MaMon009')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN012', N'Ly', N'20/12/2020', 2000000, 100, N'MaMon001')
INSERT [dbo].[ChiTietNhap] ([MaNhap], [DVT], [NgayNhap], [TongTien], [SoLuong], [MaMon]) VALUES (N'MN013', N'Ly', N'20/12/2020', 2500000, 100, N'MaMon002')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD101', N'MaMon001', 1, 200000, N'Coffee Ðá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD102', N'MaMon004', 1, 25000, N'Ca Cao Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD102', N'MaMon002', 2, 50000, N'Bạc Xỉu')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD103', N'MaMon002', 2, 50000, N'Bạc Xỉu')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD104', N'MaMon005', 1, 20000, N'Ca Cao Nóng')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD104', N'MaMon002', 2, 50000, N'Bạc Xỉu')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD105', N'MaMon004', 1, 25000, N'Ca Cao Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD105', N'MaMon006', 2, 50000, N'Cam Vắt')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD107', N'MaMon002', 2, 50000, N'Bạc Xỉu')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD108', N'MaMon004', 2, 50000, N'Ca Cao Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD108', N'MaMon003', 2, 50000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD109', N'MaMon009', 1, 10000, N'Nước Suối')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD109', N'MaMon003', 1, 25000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD110', N'MaMon005', 1, 20000, N'Ca Cao Nóng')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD110', N'MaMon009', 2, 20000, N'Nước Suối')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD112', N'MaMon003', 2, 50000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD115', N'MaMon001', 1, 20000, N'Coffee Ðá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD116', N'MaMon006', 1, 25000, N'Cam Vắt')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD117', N'MaMon002', 2, 50000, N'Bạc Xỉu')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD117', N'MaMon005', 1, 20000, N'Ca Cao Nóng')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD117', N'MaMon003', 4, 100000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD118', N'MaMon003', 1, 25000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD118', N'MaMon006', 1, 25000, N'Cam Vắt')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD118', N'MaMon005', 1, 20000, N'Ca Cao Nóng')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD103', N'MaMon009', 1, 10000, N'Nước Suối')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD104', N'MaMon004', 2, 50000, N'Ca Cao Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD105', N'MaMon003', 1, 25000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD106', N'MaMon003', 2, 50000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD108', N'MaMon006', 2, 50000, N'Cam Vắt')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD113', N'MaMon002', 2, 50000, N'Bạc Xỉu')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD115', N'MaMon002', 1, 25000, N'Bạc Xỉu')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD116', N'MaMon003', 1, 25000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD117', N'MaMon006', 6, 150000, N'Cam Vắt')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD102', N'MaMon005', 1, 20000, N'Ca Cao Nóng')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD102', N'MaMon001', 1, 20000, N'Coffee Ðá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD103', N'MaMon001', 2, 40000, N'Coffee Ðá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD104', N'MaMon001', 2, 40000, N'Coffee Ðá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD105', N'MaMon001', 1, 20000, N'Coffee Ðá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD105', N'MaMon009', 2, 20000, N'Nước Suối')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD106', N'MaMon002', 2, 50000, N'Bạc Xỉu')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD107', N'MaMon003', 2, 50000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD108', N'MaMon009', 1, 10000, N'Nước Suối')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD109', N'MaMon006', 1, 25000, N'Cam Vắt')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD110', N'MaMon006', 1, 25000, N'Cam Vắt')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD110', N'MaMon008', 1, 15000, N'Nước Ngọt')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD111', N'MaMon003', 2, 50000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD115', N'MaMon003', 1, 25000, N'Coffee Sữa Đá')
INSERT [dbo].[CTHD] ([MaHoaDon], [MaMon], [SoLuong], [Gia], [TenMon]) VALUES (N'MaHD116', N'MaMon009', 1, 10000, N'Nước Suối')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD101', N'12/12/2019', N'19:05', 1, N'MaNV001')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD102', N'22/09/2020', N'17:29:38', 5, N'MaNV001')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD103', N'22/09/2020', N'17:40:24', 5, N'MaNV002')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD104', N'25/10/2020', N'14:46:20', 7, N'MaNV002')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD105', N'25/10/2020', N'17:39:51', 7, N'MaNV001')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD106', N'26/10/2020', N'17:43:33', 4, N'MaNV002')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD107', N'29/10/2020', N'17:46:36', 4, N'MaNV003')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD108', N'01/11/2020', N'17:48:25', 7, N'MaNV003')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD109', N'09/11/2020', N'17:49:31', 3, N'MaNV003')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD110', N'11/11/2020', N'17:51:39', 5, N'MaNV001')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD111', N'12/11/2020', N'18:30:44', 2, N'MaNV003')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD112', N'12/11/2020', N'18:33:54', 2, N'MaNV003')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD113', N'24/11/2020', N'18:36:11', 2, N'MaNV003')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD114', N'24/11/2020', N'16:21:07', 0, N'MaNV003')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD115', N'24/11/2020', N'21:44:45', 3, N'MaNV002')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD116', N'24/11/2020', N'21:45:08', 3, N'MaNV002')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD117', N'02/12/2020', N'15:26:30', 13, N'MaNV003')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLapHD], [ThoiGian], [SoLuong], [MaNV]) VALUES (N'MaHD118', N'15/12/2020', N'14:20:00', 3, N'MaNV001')
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon001', N'Coffee Ðá', 20000, 199)
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon002', N'Bạc Xỉu', 25000, 195)
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon003', N'Coffee Sữa Đá', 25000, 94)
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon004', N'Ca Cao Đá', 25000, 100)
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon005', N'Ca Cao Nóng', 20000, 98)
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon006', N'Cam Vắt', 25000, 92)
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon007', N'Carrot Ép', 25000, 100)
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon008', N'Nước Ngọt', 15000, 100)
INSERT [dbo].[Menu] ([MaMon], [TenMon], [DonGia], [SoLuongTon]) VALUES (N'MaMon009', N'Nước Suối', 10000, 649)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [HoNV], [SDT], [GioiTinh]) VALUES (N'MaNV001', N'Chinh', N'Nguyen Van', N'0131213131', N'Nam')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [HoNV], [SDT], [GioiTinh]) VALUES (N'MaNV002', N'Ho', N'Doan Van', N'0131313131', N'Nam')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [HoNV], [SDT], [GioiTinh]) VALUES (N'MaNV003', N'Linh', N'Nguyen Thi', N'0928232121', N'Nữ')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [HoNV], [SDT], [GioiTinh]) VALUES (N'MaNV004', N'Tài', N'Trần Văn', N'0131213131', N'Nam')
INSERT [dbo].[PhanCa] ([MaNV], [HeSoLuong], [SoGio]) VALUES (N'MaNV001', 2, 250)
INSERT [dbo].[PhanCa] ([MaNV], [HeSoLuong], [SoGio]) VALUES (N'MaNV004', 1, 100)
INSERT [dbo].[PhanCa] ([MaNV], [HeSoLuong], [SoGio]) VALUES (N'MaNV002', 2, 250)
INSERT [dbo].[PhanCa] ([MaNV], [HeSoLuong], [SoGio]) VALUES (N'MaNV003', 1, 100)
INSERT [dbo].[TaiKhoan] ([Username], [Password]) VALUES (N'MaNV001', N'chinh123')
INSERT [dbo].[TaiKhoan] ([Username], [Password]) VALUES (N'MaNV002', N'123456')
INSERT [dbo].[TaiKhoan] ([Username], [Password]) VALUES (N'MaNV003', N'123')
ALTER TABLE [dbo].[ChiTietNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietNhap_Menu] FOREIGN KEY([MaMon])
REFERENCES [dbo].[Menu] ([MaMon])
GO
ALTER TABLE [dbo].[ChiTietNhap] CHECK CONSTRAINT [FK_ChiTietNhap_Menu]
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_HoaDon] FOREIGN KEY([MaHoaDon])
REFERENCES [dbo].[HoaDon] ([MaHoaDon])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FK_CTHD_HoaDon]
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_Menu] FOREIGN KEY([MaMon])
REFERENCES [dbo].[Menu] ([MaMon])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FK_CTHD_Menu]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[PhanCa]  WITH CHECK ADD  CONSTRAINT [FK_PhanCa_BangLuong] FOREIGN KEY([MaNV])
REFERENCES [dbo].[BangLuong] ([MaNV])
GO
ALTER TABLE [dbo].[PhanCa] CHECK CONSTRAINT [FK_PhanCa_BangLuong]
GO
ALTER TABLE [dbo].[PhanCa]  WITH CHECK ADD  CONSTRAINT [FK_PhanCa_NhanVien1] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[PhanCa] CHECK CONSTRAINT [FK_PhanCa_NhanVien1]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([Username])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
USE [master]
GO
ALTER DATABASE [CoffeeHouse] SET  READ_WRITE