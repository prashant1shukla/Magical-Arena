# Magical Arena

Magical Arena is a Spring Boot application where players can fight matches in a magical arena. This project demonstrates basic Spring Boot functionality, validation, exception handling, and unit testing.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Game Rules](#game-rules)
- [unserstanding Assignemnt](#understanding-assignment)

## Features

- Player registration and validation
- Match simulation between players
- Custom exception handling
- Dice roll utility for random attack and defense values

## Prerequisites

- Java 21
- Maven 3.8+
- An IDE like IntelliJ IDEA or VSCode

## Installation

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/magical-arena.git
   cd magical-arena

2. **Build the project using:**
  mvn clean install

3. **Run the application**

4. **API Endpoints:**
  URL: /arena/start
  Method: POST
  Request Body:
  {
      "player1": {
          "health": 50,
          "attack": 10,
          "strength": 5
      },
      "player2": {
          "health": 50,
          "attack": 10,
          "strength": 5
      }
  }
  Response:
  {
    "result": "The winner is: Player 2"
  }
  or 
  {
    "result": "The winner is: Player 1"
  }

5. **Testing:**
 mvn test

6. Game Rules:
Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0. 
Any two player can fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0

Player with lower health attacks first at the start of a match. 

Assume two players . Player A 50 health 5 strength 10 attack Player B 100 health 10 stregnth and 5 attack . Attacking die and Defending die are both 6 sided die with values ranging from 1- 6

Player A attacks and rolls die. Die roll : 5 . Player B defends and rolls die. Die roll 2

Attack damage is 5 * 10 = 50 ; Defending strength = 10 * 2 = 20 ; Player B health reduced by 30 to 70

Player B attacks and rolls die. Die roll : 4. Player A defends and rolls die. Die Roll 3

Attack damage is 4 * 5 = 20 ; Defending strength = 5 * 3 = 15 ; Player A health reduced by 5 to 45

And so on

7. Understanding Assignment:
Player:
Health
Strength 
Attack

Match:
Player1
Player2 

Attacking Dice
Defending Dice

Player’s attack: Attack*AttackDiceValue
Player’s defense: Strength*DefenseDiceValue


Player’s health after round: 
if (attack>defense) 
	health=health - (playersAttach - playersDefense)

Game ends when health=0.

To start a round: A player with lower health attacks first at the start of a match.

Sample Game:
player1:
  health: 50
  strength: 5
  attack: 10

player2:
  health: 100
  strength: 10
  attack: 50

sample round:
  - as health of p1<p2:
	player1 starts the round, 
    PLAYER A ATTACKS:
  - attackerDice: 5, defenderDice: 2
  - attackDamage: 5*10=50, defenseDamage: 2*10=20
  - playerB health: 100-(50-20)=70
    PLAYER B ATTACKS:
  - attackerDice: 4, defenderDice: 3
  - attackDamage: 4*5=20, defenseDamage: 5*3=15
  - playerB health: 50-(20-15)=45

