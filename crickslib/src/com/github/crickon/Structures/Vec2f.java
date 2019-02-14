package com.github.crickon.Structures;

public class Vec2f
{
	private float x;
	private float y;

	public Vec2f()
	{
		x = 0;
		y = 0;
	}

	public Vec2f(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	public float getX()
	{
		return x;
	}

	public void setX(float x)
	{
		this.x = x;
	}

	public float getY()
	{
		return y;
	}

	public void setY(float y)
	{
		this.y = y;
	}

	public Vec2f add(Vec2f other)
	{
		return new Vec2f(this.x + other.x, this.y + other.y);
	}

	public Vec2f subtract(Vec2f other)
	{
		return new Vec2f(this.x - other.x, this.y = other.y);
	}

	public String toString()
	{
		return String.format("[%f, %f]", x, y);
	}
}
