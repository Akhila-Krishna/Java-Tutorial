class Box{
	double width;
	double height;
	double depth;

Box(Box ob){
	width=ob.width;
	height=ob.height;
	depth=ob.depth;
}

Box(double w,double h,double d){
	width=w;
	height=h;
	depth=d;
}

Box(){
	width=-1;
	height=-1;
	depth=-1;
}

Box(double len){
	width=height=depth=len;
}

double volume(){
	return width*height*depth;
}
}

class boxw extends Box{
	double weight;

boxw(double w,double h,double d,double m){
        width=w;
        height=h;
        depth=d;
	weight=m;
}
}

class Demobox{
 public static void main(String args[]){
	boxw mybox1 = new boxw(10 , 20 , 30 , 40);
	boxw mybox2 = new boxw(2, 4, 6, 8);

	double vol;

	vol = mybox1.volume();
	System.out.println("volume1 " +vol);
	System.out.println("Weight1 " +mybox1.weight);
	System.out.println();

	vol = mybox2.volume();
        System.out.println("volume1 " +vol);
        System.out.println("Weight1 " +mybox2.weight);
        System.out.println();
}
}
