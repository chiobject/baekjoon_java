def solution(n, q, ans):
    answer = 0
    
    for i in range(1, n-3+1):
        for j in range(i+1, n-2+1):
            for k in range(j+1, n-1+1):
                for l in range(k+1, n+1-1):
                    for m in range(l+1, n+1):
                        q_list = [i, j, k, l, m]  

                        valid = True
                        for o in range(len(q)):
                            if len(set(q_list) & set(q[o])) != ans[o]:
                                valid = False
                                break
                        if valid:
                            answer += 1
    return answer