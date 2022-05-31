/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author alunocmc
 */
public class Aluno {
    private String Nome;
    private String Sobrenome;
    private String Curso;
    private String Data;
    private String RGM;
    private boolean Sexo;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public Date getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getRGM() {
        return RGM;
    }

    public void setRGM(String RGM) {
        this.RGM = RGM;
    }

    public boolean isSexo() {
        return Sexo;
    }

    public void setSexo(boolean Sexo) {
        this.Sexo = Sexo;
    }
    
    
}
