public class Caneta {

//Atributos : 

protected int carga;
public String cor,modelo;
private float ponta;
protected boolean tampada;

//Método Construtor : 

public Caneta(String c, String m, float p)
{
    this.setCor(c);
    this.setModelo(m);
    this.setPonta(p);
    tampar();

}

//Metodos : 

public void status()
{
    System.out.println("Sobre a caneta ");
    System.out.println("Caneta de cor : " + getCor());
    System.out.println("Modelo : " + getModelo());
    System.out.println("Ponta : " + getPonta());
}
public void tampar()
{
    this.tampada = true;
}
public void destampar()
{
    this.tampada = false;
}

public String getModelo()
{
    return this.modelo;
}
public void setModelo(String m)
{
    this.modelo = m;
}

public String getCor()
{
    return this.cor;
}

public void setCor(String c)
{
    this.cor = c;
}

public float getPonta()
{
    return this.ponta;
}
public void setPonta(float p)
{
    this.ponta = p;
}



}
