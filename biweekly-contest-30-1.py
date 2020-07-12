#reformat date

class Solution:
    def reformatDate(self, date: str) -> str:
        mon={"Jan":1, "Feb":2, "Mar":3, "Apr":4, "May":5, "Jun":6, "Jul":7, "Aug":8, "Sep":9, "Oct":10, "Nov":11, "Dec":12}
        l=list(map(str,date.split(" ")))
        ans=""
        d=""
        for i in range(0,3):
            for j in l[i]:
                if(i==0):
                    if j.isnumeric():
                        d+=j
                else:
                    break
            if i==1:
                m=str(mon[l[i]])
            elif i==2:
                y=l[i]
        ans+=y+"-"
        if len(m)==1:
            ans+="0"+m
        else:
            ans+=m
        ans+="-"
        if len(d)==1:
            ans+="0"+d
        else:
            ans+=d
        return ans
        
        
                    

