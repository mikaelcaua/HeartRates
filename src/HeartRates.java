import java.time.LocalDate;
import java.util.Scanner;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public HeartRates(String nome, String sobrenome, int diaNasc, int mesNasc, int anoNasc){
        this.anoNasc = anoNasc;
        this.mesNasc = mesNasc;
        this.diaNasc = diaNasc;
        this.sobrenome = sobrenome;
        this.nome = nome;

        this.showHeartRates();

    }

    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int mesAtual = dataAtual.getMonthValue();
        int diaAtual = dataAtual.getDayOfMonth();
        int idade;
        if(anoAtual>this.getAnoNasc()) {
            idade = anoAtual - this.getAnoNasc();
            if (mesAtual >= this.getMesNasc()  || diaAtual >= this.getDiaNasc()  ) {
                return idade;
            }
            else {
                return idade--;
            }
        }
        else{
            System.out.println("Ano de nascimento invalido");
        }
       return -36377;
    }

    public void showHeartRates(){
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Nome: "+this.getNome()+ " " +this.getSobrenome());
        System.out.println("Idade "+this.calcularIdade());
        calcularFreqCardiaca();
        System.out.println("\n---------------------------------------------------------\n");

    }

    public void calcularFreqCardiaca(){
        int freqCardMax = 220-this.calcularIdade();
        System.out.println("Frequencia cardiaca maxima: "+freqCardMax);
        System.out.print("Frequencia cardiaca alvo: entre " +freqCardMax/2+" e "+(freqCardMax/100)*85 +" batidas por minuto");
    }

}
