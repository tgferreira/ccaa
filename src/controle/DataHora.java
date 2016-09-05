package controle;

import java.awt.EventQueue;
import java.text.*;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DataHora {

//faz a pesquisa, dado um inteiro de 1 a 7  
    public String pesquisarDiaSemana(int _diaSemana) {
        String diaSemana = null;
        switch (_diaSemana) {
            case 1: {
                diaSemana = "Domingo";
                break;
            }
            case 2: {
                diaSemana = "Segunda - Feira";
                break;
            }
            case 3: {
                diaSemana = "Terça - Feira";
                break;
            }
            case 4: {
                diaSemana = "Quarta - Feira";
                break;
            }
            case 5: {
                diaSemana = "Quinta - Feira";
                break;
            }
            case 6: {
                diaSemana = "Sexta - Feira";
                break;
            }
            case 7: {
                diaSemana = "Sábado";
                break;
            }

        }
        return diaSemana;

    }

    //retorna o dia da semana dada uma data  
    public String retornarDiaSemana(String ano, String mes, String dia) {

        int anoInt = Integer.parseInt(ano);
        int mesInt = Integer.parseInt(mes);
        int diaInt = Integer.parseInt(dia);

        Calendar calendario = new GregorianCalendar(anoInt, mesInt - 1, diaInt);
        int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);

        return pesquisarDiaSemana(diaSemana);
    }

    //Variaveis de data
    Date date = new Date();
    DateFormat formato = new SimpleDateFormat("dd/MM/YYYY    -    HH:mm:ss");
    DateFormat formatoDataSomente = new SimpleDateFormat("dd/MM/YYYY");
    DateFormat ano = new SimpleDateFormat("YYYY");
    DateFormat mes = new SimpleDateFormat("MM");
    DateFormat dia = new SimpleDateFormat("dd");
    String formattedDate = formato.format(date);

    final String formattedano = ano.format(date);    // apenas o ano YYYY
    final String formattedmes = mes.format(date);    // apenas o mes MM          
    final String formatteddia = dia.format(date);    // apenas o dia dd

    //Metodo para setar a data e hora em JLABEL
    public void setDataHora(final JLabel labelData, final JLabel labelDiaSemana) {
        try {

            labelDiaSemana.setText(retornarDiaSemana(formattedano, formattedmes, formatteddia)); // dia da semana

            while (true) {
                Date date = new Date();
                final String formattedDate = formato.format(date); // data completa dd/MM/YYYY    -    HH:mm:ss

                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        labelData.setText(formattedDate);
                    }
                });
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Erro de DATA / HORA");
        }
    }

    //Metodo para setar a data e hora em jTextField
    public void setData(final JTextField labelData) {
        Date date = new Date();
        
        final String formattedDate = formatoDataSomente.format(date); // data dd/MM/YYYY
        
        labelData.setText(formattedDate);

    }
    
    //Metodo para retornar o dia atual
    public String dataDeHoje(){
        Date date = new Date();
        final String formattedDate = formatoDataSomente.format(date); // data dd/MM/YYYY
        return formattedDate;
    }
}
