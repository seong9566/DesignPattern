package singleton;


public class President {	
		private static President instance = new President("사람1");
		
		public static President getInPresident() {
			return instance;
		}
		
		private String name;
		
		private President(String name) {
			this.name = name;
		}
		
}
