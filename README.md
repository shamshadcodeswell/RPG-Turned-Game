# ⚔️ RPG Battle System

A Java programming exercise designed to practice **Object-Oriented Programming** concepts including abstract classes, inheritance, interfaces, composition, and polymorphism through a turn-based RPG combat engine.

---

## 🎯 Objective

Build a turn-based RPG battle system where two players each pick a hero and loadout, then fight each other in combat. Every hero behaves differently, every weapon hits differently, and every spell does something unique.

---

## 🗂️ Project Structure

```
RPG GAME/
├── Agents/
│   ├── Character.java       # Abstract base class for all characters
│   ├── Thor.java            # Hero: heavy melee + lightning magic
│   └── Ironman.java         # Hero: ranged + tech-based spells
│
├── Arsenal/
│   ├── Weapons.java         # Abstract/base class for all weapons
│   ├── Sword.java
│   ├── Staff.java
│   └── Bow.java
│
├── Abilities/
│   ├── Spells.java          # Abstract/base class for all spells
│   ├── Dark.java
│   ├── Fire.java
│   ├── Ground.java
│   ├── Lightning.java
│   ├── Magic.java
│   └── Water.java
│
└── Main.java                # Entry point — battle loop lives here
```

---

## 🧩 Core Features

### Characters
- Each hero has: `hp`, `maxHp`, `fp` (focus/mana), `maxFp`, and `heals`
- Actions available each turn: melee attack, heavy attack, special attack, magic attack, heal, flee
- Characters die when `hp <= 0`

### Weapons (Composition)
- Each weapon is **owned by** a character — not inherited
- Weapons define their own `meeleAttack()`, `heavyAttack()`, and `specialAttack()` damage values

### Spells (Composition)
- Each spell is **owned by** a character
- Spells consume `fp` on use
- Each spell has a unique `magicAttack()` effect

### Battle
- Two players each select a hero and loadout at the start
- Players alternate turns
- On each turn, the player picks an action
- Battle ends when one character's `hp` reaches 0
- A readable battle log prints after every action

---

## 🕹️ How to Run

```bash
# Compile all files
javac Agents/*.java Arsenal/*.java Abilities/*.java Main.java

# Run
java Main
```

---

## 📋 Loadout Selection (In-game)

**Weapons:**
| Input | Weapon |
|-------|--------|
| 1 | Sword |
| 2 | Staff |
| 3 | Bow |

**Spells (ULT):**
| Input | Spell |
|-------|-------|
| 1 | Dark |
| 2 | Fire |
| 3 | Ground |
| 4 | Lightning |
| 5 | Magic |
| 6 | Water |

---

## 🔧 OOP Concepts Practiced

| Concept | Where |
|---|---|
| Abstract Class | `Character`, `Weapons`, `Spells` |
| Inheritance | `Thor`, `Ironman` extend `Character` |
| Composition | Heroes *own* a `Weapons` and `Spells` object |
| Polymorphism | Calling `meeleAttack()` behaves differently per weapon |
| Encapsulation | `private` fields with controlled access |
| Packages | Code organised into `Agents`, `Arsenal`, `Abilities` |

---

## 🚀 Stretch Goals

- [ ] Status effects — poison, stun, burn (tick each turn)
- [ ] Equipment that modifies base stats
- [ ] Add more heroes (Hulk, Black Widow, etc.)
- [ ] Simple inventory system
- [ ] Enemy AI for single-player mode
- [ ] Battle history / full combat log at end of match
