/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.utilities.MysqlUtility;
import jdbc.model.Mahasiswa;

/**
 *
 * @author ACER
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        return new Mahasiswa(id, nama);
    }

    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return makeMhsObject(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement st = koneksi.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                listMhs.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }
}