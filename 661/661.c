#include<stdio.h>
strcture device{
	int power;
	int status=0;
}

int main()
{
	int n,m,c,i=1,j,temp,devNo,totalPower=0,maxPower=0,sequence=0;
	structure devices arr[21];
	while(1)
	{   totalPower=0;maxPower=0;
		i=1;
		sequence++;
		scanf("%d%d%d",&n,&m,&c);
		if(n==0)
			exit(0);
		for (j=0; j< n; ++j)
		{
			
		    scanf("%d",&temp);
			arr[i++].power=temp;
		}
		
		
		for (i=1; i <m; ++i)
		{
			scanf("%d",devNo);
			arr[devNo].status=(arr[devNo]==0)?1:0;

			if(arr[devNo].status==1)
			{
				totalPower=totalPower+arr[devNo].power;
				 if(totalPower>c)
				 {
				 	printf("\n Sequence %d\nFuse was blown",sequence );
				 	break;

				 }
				if(totalPower>maxPower)
					maxPower=totalPower;

			}
			if(arr[devNo].status==0)
			{
				totalPower=totalPower-arr[devNo].power;

			}



		}

		printf("\n Sequence %d\nFuse was not blown",sequence);
		printf("\nMaximal power consumption was %d amperes",maxPower);
		
			


	}
	return 0;

}