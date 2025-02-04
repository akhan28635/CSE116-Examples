package week4.oop_physics.without_oop

import week4.oop_physics.PhysicsVector

class Ball(val location: PhysicsVector,
           val velocity: PhysicsVector,
           val mass: Double) {

  def use(player: Player): Unit = {
    this.velocity.x = player.orientation.x * player.strength
    this.velocity.y = player.orientation.y * player.strength
    this.velocity.z = player.strength
  }

}
