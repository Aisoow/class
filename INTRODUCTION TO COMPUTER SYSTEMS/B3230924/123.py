import pygame
import math
import random

# 初始化 Pygame
pygame.init()

# 設定畫面尺寸和顏色
WIDTH, HEIGHT = 800, 600
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("鐵鏈打破牆動畫")
clock = pygame.time.Clock()

# 顏色定義
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
GRAY = (100, 100, 100)
BROWN = (139, 69, 19)
RED = (200, 50, 50)

# 鐵鏈參數
chain_radius = 10
chain_length = 200
chain_segments = 10
chain_angle = math.pi / 4  # 起始角度
chain_speed = 0.05  # 鐵鏈揮動速度
pivot_x, pivot_y = WIDTH // 4, HEIGHT // 2

# 牆參數
wall_x, wall_y = WIDTH // 2, HEIGHT // 3
brick_width, brick_height = 50, 30
wall_rows, wall_cols = 6, 8
bricks = []

# 建立牆上的磚塊
for row in range(wall_rows):
    for col in range(wall_cols):
        bricks.append(
            pygame.Rect(
                wall_x + col * brick_width,
                wall_y + row * brick_height,
                brick_width,
                brick_height,
            )
        )

# 鐵鏈撞擊牆壁的判斷
def check_collision(chain_tip):
    global bricks
    for brick in bricks[:]:
        if brick.collidepoint(chain_tip):
            bricks.remove(brick)

# 磚塊破碎效果
def scatter_bricks():
    scattered = []
    for brick in bricks:
        scattered.append(
            [brick.x, brick.y, random.uniform(-5, 5), random.uniform(-5, 5)]
        )
    return scattered

# 動畫主迴圈
def main():
    global chain_angle
    scattered_bricks = []
    running = True
    while running:
        screen.fill(WHITE)

        # 處理事件
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

        # 鐵鏈揮動動畫
        chain_angle += chain_speed
        chain_tip_x = pivot_x + chain_length * math.cos(chain_angle)
        chain_tip_y = pivot_y + chain_length * math.sin(chain_angle)

        # 畫鐵鏈
        prev_x, prev_y = pivot_x, pivot_y
        for i in range(chain_segments):
            segment_x = prev_x + (chain_length / chain_segments) * math.cos(chain_angle)
            segment_y = prev_y + (chain_length / chain_segments) * math.sin(chain_angle)
            pygame.draw.line(screen, GRAY, (prev_x, prev_y), (segment_x, segment_y), 5)
            pygame.draw.circle(screen, BLACK, (int(segment_x), int(segment_y)), chain_radius)
            prev_x, prev_y = segment_x, segment_y

        # 碰撞檢測
        check_collision((chain_tip_x, chain_tip_y))

        # 畫牆壁
        for brick in bricks:
            pygame.draw.rect(screen, BROWN, brick)
            pygame.draw.rect(screen, RED, brick, 2)

        # 磚塊破碎動畫
        if len(bricks) < wall_rows * wall_cols:
            if not scattered_bricks:
                scattered_bricks = scatter_bricks()
            for sb in scattered_bricks:
                sb[0] += sb[2]
                sb[1] += sb[3]
                pygame.draw.rect(screen, BROWN, (sb[0], sb[1], brick_width, brick_height))

        # 更新畫面
        pygame.display.flip()
        clock.tick(60)

    pygame.quit()

if __name__ == "__main__":
    main()
