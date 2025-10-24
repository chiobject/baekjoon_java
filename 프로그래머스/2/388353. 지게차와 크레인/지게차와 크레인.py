from collections import deque

def solution(storage, requests):
    storage_2d = []
    for str in storage:
        storage_2d.append([s for s in str])
    
    for re in requests:
        target = re[0]  
        
        if len(re) > 1:  
            for i in range(len(storage_2d)):
                for j in range(len(storage_2d[i])):
                    if storage_2d[i][j] == target:
                        storage_2d[i][j] = " "
        
        else: 
            accessible = find_accessible(storage_2d)
            
            for i in range(len(storage_2d)):
                for j in range(len(storage_2d[i])):
                    if storage_2d[i][j] == target and accessible[i][j]:
                        storage_2d[i][j] = " "
    
    answer = 0
    for i in range(len(storage_2d)):
        for j in range(len(storage_2d[i])):
            if storage_2d[i][j] != " ":
                answer += 1
    
    return answer


def find_accessible(storage_2d):
    n = len(storage_2d)
    m = len(storage_2d[0])
    
    accessible = [[0] * m for _ in range(n)]
    
    queue = deque()
    
    for i in range(n):
        for j in range(m):
            if i == 0 or i == n-1 or j == 0 or j == m-1:
                accessible[i][j] = True
                queue.append((i, j))
    
    dx = [-1, 1, 0, 0] 
    dy = [0, 0, -1, 1]
    
    while queue:
        x, y = queue.popleft()  
        
        if storage_2d[x][y] == " ":
            for k in range(4):
                nx = x + dx[k]
                ny = y + dy[k]
                
                if 0 <= nx < n and 0 <= ny < m and not accessible[nx][ny]:
                    accessible[nx][ny] = True
                    queue.append((nx, ny))
    
    return accessible