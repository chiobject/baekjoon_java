def solution(players, m, k):
    answer = 0
    server = []  # 증설된 서버들의 남은 운영 시간
    
    for user in players:
        # 1. 기존 서버들의 수명 1 감소 및 만료된 서버 제거
        server = [x - 1 for x in server if x > 1]
        
        # 2. 현재 필요한 증설 서버 수
        need_server = user // m
        
        # 3. 현재 활성 증설 서버 수
        active_server = len(server)
        
        # 4. 부족하면 증설
        if active_server < need_server:
            add_server = need_server - active_server
            answer += add_server
            server.extend([k] * add_server)
    
    return answer