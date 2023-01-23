class Solution:

    #Function to remove pair of duplicates from given string using Stack.
    def removePair(self,s):
        # code here
          st=[]

        l=list(s)

        for i in range(len(l)):

            if len(st)==0:

                st.append(l[i])

            elif st[-1]==s[i]:

                st.pop(-1)



            else:

                st.append(s[i])

        if len(st)==0:

            return -1

        else:



            return "".join(st)
