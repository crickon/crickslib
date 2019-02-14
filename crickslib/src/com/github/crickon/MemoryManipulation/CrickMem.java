package com.github.crickon.MemoryManipulation;

import java.nio.ByteBuffer;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;

public class CrickMem
{
	private int processID;
	private Pointer process;

	public CrickMem(String processString)
	{
		this.processID = MemoryManipulation.getProcessId(processString);
		this.process = MemoryManipulation.openProcessId(this.processID);
	}
	public int getProcessID()
	{
		return this.processID;
	}

	public int readInt(long address)
	{
		Memory mem = MemoryManipulation.readMemory(this.process, address, 4);
		return mem.getInt(0);
	}

	public float readFloat(long address)
	{
		Memory mem = MemoryManipulation.readMemory(this.process, address, 4);
		return mem.getFloat(0);
	}

	public void writeInt(long address, int i)
	{
		byte[] data = ByteBuffer.allocate(4).putInt(i).array();
		MemoryManipulation.writeMemory(process, address, data);
	}

	public void writeFloat(long address, float f)
	{
		byte[] data = ByteBuffer.allocate(4).putFloat(f).array();
		MemoryManipulation.writeMemory(process, address, data);
	}
}
