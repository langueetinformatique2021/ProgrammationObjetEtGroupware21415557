package atelier07;

import cours04.FigureGeometrique;
import java.lang.Comparable;

public class Cercle extends FigureGeometrique implements Comparable  {
	private double rayon;
	//constructeur构造函数
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	//Getter pour le rayon获取半径
	public double getRayon() {
		return rayon;		
	}
	//Méthode pour calculer la surface du cercle计算圆的面积
    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    //Méthode pour calculer le périmètre du cercle计算圆的周长
    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    // 按半径比较两个圆的大小
    @Override
    public int compareTo(Cercle autre) {
        return Double.compare(this.rayon, autre.rayon);
    }

    // 重写 toString 方法以显示圆的信息
    @Override
    public String toString() {
        return "Cercle [rayon=" + rayon + ", aire=" + calculerAire() + ", périmètre=" + calculerPerimetre() + "]";
    }
}

public class Cercle extends FigureGeometrique implements Comparable  {
	
	double rayon;
	
	/** Création d'une nouvelle instance de Cercle */
	public Cercle(float x) {
		super("noir");
		rayon = x;