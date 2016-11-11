
package tasks;

import java.util.Stack;

public class BracketsValidator
{
	private String brackets;

	public BracketsValidator(String brackets)
	{
		this.brackets = brackets;
	}

	public boolean validate()
	{
		boolean result = true;
		Stack<Character> stack = new Stack<Character>();
		char current;
		char previous;
		for (int i = 0; i < brackets.length(); i++)
		{
			current = brackets.charAt(i);
			if (current == '(' || current == '[' || current == '{')
			{
				stack.push(current);
			}
			else if (current == ')' || current == ']' || current == '}')
			{
				if (stack.isEmpty())
				{
					result = false;
				}
				else
				{
					previous = stack.peek();
					if ((current == ')' && previous == '(') || (current == ']' && previous == '[') || (current == '}' && previous == '{'))
					{
						stack.pop();
					}
					else
					{
						result = false;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		BracketsValidator bv = new BracketsValidator("[({([)]})]");
		System.out.println(bv.validate());
	}
}
