package Exercise2;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;
	private static int COUNT = 0;
	
	public Student(String name, int group) {
		this.id = COUNT++;
		this.name = "Nguyễn Văn "+name;
		this.group = group;
	}

	public int getGroup() {
		return group;
	}

	@Override
	public void rollUp() {
		System.out.println(this.name +" điểm danh");	
	}

	@Override
	public void study() {
		System.out.println(this.name +" đang học bài");
	}

	@Override
	public void cleaning() {
		System.out.println(this.name +" đang dọn vệ sinh");
	}
	
}
