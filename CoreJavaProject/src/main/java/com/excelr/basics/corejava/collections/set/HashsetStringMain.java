package com.excelr.basics.corejava.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

public class HashsetStringMain {

	public static void main(String[] args) {
		Set<String> players = new HashSet<>();
		players.add("player1");
		players.add("player2");
		players.add("player3");
		players.add("player4");
		players.add("player4");
		players.add("player5");
		players.add("player5");
		players.add("player6");



		HashsetStringMain obj = new HashsetStringMain();
		
		System.out.println("------------printing using ForEach--------------");
		obj.iterateUsingForEachLoop(players);
		System.out.println();
		
		System.out.println("------------printing using Lambda--------------");
		obj.iterateUsingLambda(players);
		System.out.println();
		
		System.out.println("------------printing using Iterator--------------");
		obj.iterateUsingIterator(players);
		System.out.println();
	}

	private void iterateUsingIterator(Set<String> players) {
		// TODO Auto-generated method stub
		if(!CollectionUtils.isEmpty(players))
		{
			for(String player: players)
			{
				System.out.println(player);
			}
		}
	}

	private void iterateUsingLambda(Set<String> players) {
		// TODO Auto-generated method stub
		if(!CollectionUtils.isEmpty(players))
		{
			players.forEach(item->System.out.println(item));
		}
	}

	private void iterateUsingForEachLoop(Set<String> players) {
		// TODO Auto-generated method stub
		if(!CollectionUtils.isEmpty(players))
		{
			Iterator<String> iterator = players.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		}
	}
}
