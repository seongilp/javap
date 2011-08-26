import java.io.*;

class FileInfo {
  public static void main(String args[]) {
    //명령행 매개 변수를 입력하지 않은 경우 사용법을 출력한다.
    if (args.length == 0) {
      System.out.println
      ("사용법 : java FileInfo filename");
      return;
    }

    //입력된 매개 변수 인자로 File 객체를 생성한다.
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
        f.getName() + " 은 쓸 수 있습니다.");
        if (f.canRead()) 
        System.out.println
        (f.getName() + " 은 읽을 수 있습니다.");
        if (f.isFile()) {
           System.out.println
           (f.getName() + " 은 파일입니다.");
        } else {
           System.out.println
           (f.getName() + " 은 디렉토리입니다.");
        } 
        System.out.println
        (f.getName() + " 의 크기는 " + f.length() + "입니다.");
      } catch (IOException e) {
        System.err.println(e); 
      }
    } else {
       System.out.println
       ("입력하신 다음 파일을 찾을 수 없습니다. : " + args[0]);
    }

   
  }
}
