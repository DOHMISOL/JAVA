
public class h2 {
	public static void main(String[] args) {
		int n = 10;
		int [] arr = {7,5,9,8,3,1,6,2,4,8};
		
		//STEP 1. 가장 작은 숫자 인덱스를 찾아서 제일 앞으로 보내기(Point! 가장 작은것을 반복적으로 선택한다!)
		for(int i =0; i<n-1;i++) {
			int minValue = i;
				for(int j=i+1; j<n;j++) {
					if(arr[minValue]>arr[j]) {
						minValue = j;
					}
				}
			
		//STEP 2. 임시변수공간을 활용하여 가장 작은 숫자를 바꿔준다.(Point ! 임시공간에 잠시 넣어두고 숫자를 바꾼다.		
			int temp = arr[i];
			arr[i] = arr[minValue];
			arr[minValue] = temp;
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i] + " ");
			}
		}
}

//선택정렬
