package com.github.crickon.Structures;

public class Vec3f
{
	private float x;
	private float y;
	private float z;

	public Vec3f()
	{
		x = 0;
		y = 0;
		z = 0;
	}

	public Vec3f(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
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

	public float getZ()
	{
		return z;
	}

	public void setZ(float z)
	{
		this.z = z;
	}

	public String toString()
	{
		return String.format("[%f, %f, %f]", x, y, z);
	}
}
