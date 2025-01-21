import math
from turtle import *

def herata(k):
    return 15 * math.sin(k)**3

def heartb(k):
    return 12 * math.cos(k) - 5 * math.cos(2 * k) - 2 * math.cos(3 * k) - math.cos(4 * k)

speed(0)
bgcolor("black")
penup()
goto(0, 0)
pendown()
color("red")

for i in range(10000):
    k = i / 1000 * math.pi  # Scale the loop to cover a large range
    x = herata(k)
    y = heartb(k)
    goto(x * 20, y * 20)  # Scale up for better visibility
    dot(2)  # Draw a dot at each point
done()
