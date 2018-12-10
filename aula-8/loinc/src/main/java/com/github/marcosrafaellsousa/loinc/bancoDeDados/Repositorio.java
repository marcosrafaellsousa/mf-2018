package com.github.marcosrafaellsousa.loinc.bancoDeDados;

import com.github.marcosrafaellsousa.loinc.negocio.Loinc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    public List ConsultaLista(Connection conn) throws SQLException {

        List<Loinc> lista = new ArrayList<Loinc>();
        String sql = "select * from loinc";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);


        while(rs.next()) {
            Loinc loinc = new Loinc();
            preencheLoinc (loinc,rs);
            lista.add(loinc);
        }
        rs.close();
        stmt.close();

        return lista;
    }

    public Loinc ConsultaPorLoincNum (Connection conn, String loincNum) throws SQLException {
        Loinc loinc = new Loinc();

        String sql = String.format("select * from loinc where LOINC_NUM = '%s'",loincNum);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            preencheLoinc(loinc, rs);
        }
        rs.close();
        stmt.close();

        return loinc;
    }

    public List<Loinc> ConsultaPorComponent (Connection conn, String component) throws SQLException {

        List<Loinc> lista = new ArrayList<Loinc>();
        String sql = String.format("select * from loinc where COMPONENT = '%s'",component);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            Loinc loinc = new Loinc();
            preencheLoinc (loinc,rs);
            lista.add(loinc);
        }
        rs.close();
        stmt.close();

        return lista;
    }

    public Loinc ConsultaPorShortName (Connection conn, String shortName) throws SQLException {
        Loinc loinc = new Loinc();

        String sql = String.format("select * from loinc where SHORTNAME = '%s'",shortName);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            preencheLoinc(loinc, rs);
        }
        rs.close();
        stmt.close();

        return loinc;
    }

    public List<Loinc> ConsultaPorSystem (Connection conn, String system) throws SQLException {

        List<Loinc> lista = new ArrayList<Loinc>();
        String sql = String.format("select * from loinc where SYSTEM = '%s'",system);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            Loinc loinc = new Loinc();
            preencheLoinc (loinc,rs);
            lista.add(loinc);
        }
        rs.close();
        stmt.close();

        return lista;
    }



    private void preencheLoinc(Loinc loinc, ResultSet rs) throws SQLException {
        loinc.setLoinc_num(rs.getString("LOINC_NUM"));
        loinc.setComponent(rs.getString("COMPONENT"));
        loinc.setShortname(rs.getString("SHORTNAME"));
        loinc.setSystem(rs.getString("SYSTEM"));
    }
}
