package BookArray;

public class Book {
	
	//start main method
	
		public static void main(String[]args)
		
		{
			
			//create an array to store 10 books
			
			Book books [] = new Book[10];
			
			//create and store 5 Fiction objects
			
			books[0] = new Fiction("The First Animals");
			
			books[1] = new Fiction("And Then There Were None");
			
			books[2] = new Fiction("The Grim Reaper");
			
			books[3] = new Fiction("Spirited Away");
			
			books[4] = new Fiction("Inception");
			
			books[5] = new NonFiction("In Cold Blood");
			
			books[6] = new NonFiction("Silent Spring");
			
			books[7] = new NonFiction("A Room of One's Own");
			
			books[8] = new NonFiction("When Breath Becomes Air");
			
			books[9] = new NonFiction("The Tipping Point");
			
			  //display the details of all books
			
			System.out.println("Details of all tha books:");
			
			for (int i = 0; i < books.length; i++)
				
			{
				
				System.out.println();
				
				System.out.println((i+1)+ "Name:"+ books[i].getBookTitle());
				
				System.out.println("Price: $" + books[i].getBookPrice());
			
			}//end for
			
		}//end of main method
		
	//end of BookArray class class Book{
		
		private String bookTitle;
		private double bookPrice;
		
		public Book(String title) {
			this.bookTitle = title;
				bookPrice = 43.54;
				
			}
		
		public String getBookTitle() {
			return bookTitle;
		}
			
			public double getBookPrice() {
				return bookPrice;
				
			}
		}
		
		class Fiction extends Book{
			public Fiction(String title) {
				super(title);
				
			}
			
		}
		
		class NonFiction extends Book{
			public NonFiction(String title) {
				super(title);
				
			}
			
		}

