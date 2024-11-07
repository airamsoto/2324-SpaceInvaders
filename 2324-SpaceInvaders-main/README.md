# Practice 1: Space Invaders - TP1 UCM

This project is part of the **TP1 (Programming Techniques I)** course in the second year of the **Software Engineering Degree** at the **Complutense University of Madrid**. The practice involves implementing a simplified version of the classic game *Space Invaders* in Java, utilizing object-oriented programming principles, arrays, enumerated types, and console input/output.

## Objectives of the Practice

- Introduce and apply **object-oriented programming** concepts in Java.
- Utilize and manipulate **arrays** and **enumerated types**.
- Handle and process **strings** with the `String` class.
- Perform **console input and output** for user interaction.

## Game Description

The game takes place on a **9 x 8** grid where the player controls a spaceship (UCMShip) and must destroy alien ships by firing lasers. The game is turn-based, allowing the player to perform one action per cycle, followed by updates to the positions of ships and other objects.

### Types of Ships

- **UCMShip**: Controlled by the player, with 3 health points and the ability to shoot a laser.
- **Regular Alien**: Common alien ships with 2 health points, unable to shoot.
- **Destroyer Alien**: Alien ships with 1 health point that can drop bombs.
- **UFO**: Provides a *shockWave* to the player when destroyed.

### Game Cycle

1. **Draw**: Render the current state of the board and display game information.
2. **User Command**: Request an action from the player (e.g., move, shoot, use a *shockWave*).
3. **Update**: Update the game by processing automatic actions and movements.

## Requirements and Execution

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/SpaceInvadersTP1.git
