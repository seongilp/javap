import java.io.*;

class FileInfo {
  public static void main(String args[]) {
    //����� �Ű� ������ �Է����� ���� ��� ������ ����Ѵ�.
    if (args.length == 0) {
      System.out.println
      ("���� : java FileInfo filename");
      return;
    }

    //�Էµ� �Ű� ���� ���ڷ� File ��ü�� �����Ѵ�.
    File f = new File(args[0]);
    if (f.exists()) {
      try {
        System.out.println
        ("getName: " + f.getName());
        System.out.println
        ("getPath: " + f.getPath());
        System.out.println
        ("getAbsolutePath: " + f.getAbsolutePath());
        System.out.println
        ("getCanonicalPath: " + f.getCanonicalPath());
        System.out.println
        ("getParent: " + f.getParent());
        if (f.canWrite()) 
        System.out.println(
        f.getName() + " �� �� �� �ֽ��ϴ�.");
        if (f.canRead()) 
        System.out.println
        (f.getName() + " �� ���� �� �ֽ��ϴ�.");
        if (f.isFile()) {
           System.out.println
           (f.getName() + " �� �����Դϴ�.");
        } else {
           System.out.println
           (f.getName() + " �� ���丮�Դϴ�.");
        } 
        System.out.println
        (f.getName() + " �� ũ��� " + f.length() + "�Դϴ�.");
      } catch (IOException e) {
        System.err.println(e); 
      }
    } else {
       System.out.println
       ("�Է��Ͻ� ���� ������ ã�� �� �����ϴ�. : " + args[0]);
    }

   
  }
}
