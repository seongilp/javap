
class Manager extends Employee {
	int managerFee;
	public Manager(int i,String n, int j, int k, int l) {
		super(i,n,j,k);
//		empNum = i;
//		name = n;
//		baseSalary = i;
//		soodang = k;
		managerFee = l;
	}
	void print() {
		int sal = baseSalary+soodang+managerFee;
		System.out.println("���: " + empNum);
		System.out.println("�̸�: " + name);		
		System.out.println("�޿� : " + sal);
	}
}