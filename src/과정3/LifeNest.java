package 과정3;

public class LifeNest {
	Organism[] organismList = new Organism[100];
	int num;
	
	public LifeNest()
	{
		num = 0;
	}
	
	void add(Organism x)
	{
		organismList[num] = x;
		num++;
		System.out.println("[LifeNest]: " + x.name + "이 추가되었습니다.");
	}
	
	void delete(String name)
	{
		for(int i=0;i<num;i++)
		{
			if(organismList[i] != null && organismList[i].name.equals(name))
			{
				organismList[i] = null;
			}
		}

		System.out.println("[LifeNest]: " + name + "이 삭제되었습니다.");
	}
	
	void print_all()
	{
		int index = 1;
		for(int i=0;i<num;i++)
		{
			if(organismList[i]!=null)
			{
				System.out.print(index+". ");
				organismList[i].displayInfo();
				index++;
				System.out.println();
			}
		}
	}
}
