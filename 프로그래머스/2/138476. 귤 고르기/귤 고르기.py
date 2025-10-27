def solution(k, tangerine):
    answer = 0
    get = k
    idx = []
    count = []
    tangerine.sort()
    for i in tangerine:
        if not idx or idx[-1] != i:
            idx.append(i)
            count.append(1)
        else:
            count[-1] += 1
    count.sort(reverse=True)
    for i in count:
        get -= i
        answer += 1
        if get <= 0:
            break
    return answer