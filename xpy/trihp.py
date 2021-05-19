from math import sqrt


def trihp (a,b, c, f, g):
  return 0.5*c*(sqrt(a**2-((c**2+a**2-b**2)/(2*c))**2)+sqrt(f**2-((c**2+f**2-g**2)/(2*c))**2))

area=trihp(3.2, 2.6, 5.15,4.0, 5.5)

print(area)