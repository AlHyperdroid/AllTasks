package hierarchy;

public class HMain {
    public static void main(String [] args){
        SNoteI sni = new SNoteI();
        System.out.println(sni.getModel() + " " + sni.getDisplayResolution() + " " + sni.getDisplaySize()
                + " " + sni.getBattery() + " " + sni.getPen() + " " + sni.getOS());

        SNoteII snii = new SNoteII();
        System.out.println(snii.getModel() + " " + snii.getDisplayResolution() + " " + snii.getDisplaySize()
                + " " + snii.getBattery() + " " + snii.getPen() + " " + snii.getOS());

        SNoteIII sniii = new SNoteIII();
        System.out.println(sniii.getModel() + " " + sniii.getDisplayResolution() + " " + sniii.getDisplaySize()
                + " " + sniii.getBattery() + " " + sniii.getPen() + " " + sniii.getOS());

        OX ox = new OX();
        System.out.println(ox.getModel() + " " + ox.getDisplayResolution() + " " + ox.getDisplaySize()
                + " " + ox.getBattery() + " " + ox.getStretchableDisplay() + " " + ox.getOS());

        HMateX hmx = new HMateX();
        System.out.println(hmx.getModel() + " " + hmx.getDisplayResolution() + " " + hmx.getDisplaySize()
                + " " + hmx.getBattery() + " " + hmx.getFoldable() + " " + hmx.getOS());

    }


}
